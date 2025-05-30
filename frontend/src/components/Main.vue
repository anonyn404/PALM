<template>
  <div :class="['container']">
    <div :class="['navbar']">
      <h1>PALM</h1>
      <div class="example-selector">
        <label for="exampleSelect">Examples:</label>
        <select id="exampleSelect" @change="loadExample($event)">
          <option value="">-- Select an example --</option>
          <option v-for="(code, name) in examples" :key="name" :value="name">{{ name }}</option>
        </select>
      </div>
    </div>
    <!-- Code Editor -->
    <div id="monaco-editor" class="code-editor"></div>

    <div class="button-container">
      <!--button :class="['action-button']" @click="compileCode" :disabled="loading">
        Compile
      </button-->
      <button :class="['action-button']" @click="submitCode" :disabled="loading">
        Generate
      </button>
    </div>

    <!-- Result Form -->
    <!--Paths-->
    <div :class="['path-form']">
      <div v-show="showTreeVisualizer" class="tree-visualizer">
        <svg ref="svgRef"></svg>
      </div>

      <h2>Symbolic Tree</h2>
      <div :class="['path-list-container']">
        <ul class="path-list">
          <h2> Program Path Variant </h2>

          <li v-for="(path, index) in paths" :key="index"
              :class="['path-item', { 'selected-path': selectedPathIndex === index}]"
              @click="selectPath(index)">
            <div :class="['path-box']" v-if="selectedPathIndex === index">
              <div v-if="selectedPathIndex === index">
<div
  v-for="(line, i) in path.variant.split('\n')"
  :key="i"
  :class="getLineClass(i)"
>{{ line }}
</div>
              </div>
              <pre v-else class="path-preview">Path Variant {{ index + 1}} .. {{ path.pathId }}</pre>
            </div>
          </li>
        </ul>
      </div>

      <!--textarea id="compile" v-model="compile"></textarea-->

    </div>


    <!--Tests-->
    <!-- Tests Section -->
    <div :class="['test-form']">
      <h2>Generated Test</h2>
      <div :class="['test-list-container']">
        <ul class="test-list">
          <li v-for="(test, index) in tests" :key="index"
              :class="['test-item', {
                'test-pass': test.status === 'pass',
                'test-fail': test.status === 'error',
                'test-unsat': test.status === 'unsat'
              }]"
              @click="toggleTest(index)">
            <div :class="['test-box']">
              <div :class="['test-case']" v-if="expandedTestIndex !== index">{{ test.code }}</div>
              <pre v-else class="test-preview">{{ test.code }}</pre>
            </div>
          </li>
          <div :class="['test-box', {
            'test-pass': verifyResult?.status === 'pass',
            'test-fail': verifyResult?.status && verifyResult.status !== 'pass',
            }]"
          >
            <textarea v-model="testToVerify"
                placeholder="Enter your test case here..."
                class="verify-textarea">
            </textarea>
          </div>
        </ul>
      </div>
      <!--button :class="['action-button']">Regenerate</button-->
      <div :class="['button-verify']">
        <button :class="['action-button']" @click="verifyTest" :disabled="loading">
          Verify
        </button>
        <button :class="['action-button']" @click="findPath" :disabled="loading">
          Find Path
        </button>
      </div>
    </div>

    <!-- Verify Test: Buttons at Middle right -->
    <!--div :class="['test-verify']">
      <h2>Verify / Find Path </h2>
      
      <div :class="['button-verify']">
      <button :class="['action-button']" @click="verifyTest" :disabled="loading">
        Verify
      </button>
      <button :class="['action-button']" @click="findPath" :disabled="loading">
        Find Path
      </button>
      </div>
    </div-->

    <!-- Prompt display -->
    <div :class="['prompt-box']">
      <h2> Prompt </h2>
      <div class="prompt-display"><div v-if="tests[expandedTestIndex]?.prompt">{{ tests[expandedTestIndex].prompt }}</div>
        <div v-else>Select a test case to view its prompt</div>
      </div>
    </div>

    <!-- Loading Indicator -->
    <div v-if="loading" class="loading-overlay">
      <div class="spinner"></div>
      <p>Processing...</p>
    </div>
  </div>
</template>

<script>
import * as monaco from "monaco-editor";
import {ref, onMounted, nextTick, watch} from "vue";
import * as d3 from "d3";
import API_URL from "@/config.js";

export default {
  name: "MainApp",
  setup() {
    let editor = null;
    // Examples ref, to be populated dynamically
    const examples = ref({});

    // Load example into editor
    const loadExample = (event) => {
      const name = event.target.value;
      if (examples.value[name] && editor) {
        editor.setValue(examples.value[name]);1
      }
    };
    const compile = ref('');
    const paths = ref([]); // Store multiple paths
    const selectedPathIndex = ref(null); // Track the selected path index
    const tests = ref([]); // Store tests for the selected path
    const loading = ref(false); // State for loading indicator
    const expandedTestIndex = ref(null); // Track which test is expanded
    const treeAvailable = ref(false); // Initially false
    const submitResult = ref(null);
    const showTreeVisualizer = ref(true);
    const svgRef = ref(null);
    const testToVerify = ref(''); // Track the test to verify
    const verifyResult = ref(null); // Track the result of the verification
    let nodes;

    // for monaco editor
    const highlightErrorLine = (line, message) => {
      const model = editor.getModel();
      if (!model) return;

      monaco.editor.setModelMarkers(model, "errorMarkers", [
        {
          startLineNumber: line,
          startColumn: 1,
          endLineNumber: line,
          endColumn: model.getLineMaxColumn(line),
          message: message,
          severity: monaco.MarkerSeverity.Error,
        },
      ]);
    };
    // for monaco editor
    const clearErrorMarkers = () => {
      const model = editor.getModel();
      if (!model) return;
      monaco.editor.setModelMarkers(model, "errorMarkers", []);
    };

    // Highlight lines based on failingf assertion IDs
    const getLineClass = (i) => {
      //const match = line.match(/\/\/\[(\d+)\]/); // Find assertion comment
      //const assertionId = match ? parseInt(match[1]) : null;

      // console.log(expandedTestIndex.value);
      // console.log(tests.value[expandedTestIndex.value]?.status);
      // console.log(tests.value[expandedTestIndex.value]?.errline);

      if (
        //assertionId !== null &&
        expandedTestIndex.value !== null &&
        tests.value[expandedTestIndex.value]?.status === 'error' &&
        //tests.value[expandedTestIndex.value]?.errid === assertionId
        tests.value[expandedTestIndex.value]?.errline === i
      ) {
        return 'highlight-error';
      }

      // when verifying a test case, all previous tests are not highlighted
      if (
        //assertionId !== null &&
        expandedTestIndex.value === null &&
        verifyResult.value !== null &&
        verifyResult.value.status === 'error' &&
        verifyResult.value.errline === i
      ) {
        return 'highlight-error';
      }

      return 'code-line';
    };

    // Select path action
    const selectPath = (index) => {
      selectedPathIndex.value = index;
      tests.value = paths.value[index]?.tests || []; // Populate tests for the selected path
    };
    // Verify test action
    const verifyTest = async () => {
      loading.value = true; // Show loading
      expandedTestIndex.value = null; // Reset expanded test index
      try {
        const codeContent = editor.getValue();
        const pcid = paths.value[selectedPathIndex.value].pathId;
        const testContent = testToVerify.value;
        console.log(codeContent);
        console.log(pcid);
        console.log(testContent);
        // index is not the true pcid
        const response = await fetch(`${API_URL}/verifyTest`, {
          method: "POST",
          headers: { "Content-Type": "application/json" },
          body: JSON.stringify({ code: codeContent, pcid, test: testContent }),
        });
        const result = await response.json();
        console.log(result);
        verifyResult.value = {
          status: result.status.toLowerCase(),
          errid: result.errid,
          errline: result.errline
        };
      }
      catch (error) {
        console.error("Error when verifying test:", error);
      }
      finally {
        loading.value = false; // Hide loading
      }
    }
    // Verify test action
    const findPath = async () => {
      loading.value = true; // Show loading
      expandedTestIndex.value = null; // Reset expanded test index
      selectedPathIndex.value = null; // Reset selected path index
      verifyResult.value = null; // Clear verify result
      try {
        const codeContent = editor.getValue();
        const testContent = testToVerify.value;
        console.log(codeContent);
        console.log(testContent);
        // index is not the true pcid
        const response = await fetch(`${API_URL}/findPath`, {
          method: "POST",
          headers: { "Content-Type": "application/json" },
          body: JSON.stringify({ code: codeContent, test: testContent }),
        });
        const result = await response.json();
        const pathId = result;
        const index = paths.value.findIndex(p =>
          p.pathId === pathId
        );
        console.log(index, result);

        if (index !== -1) {
          selectPath(index);
          nodes.dispatch("mouseout");
        }
        else {
          console.log("No path found.");
        }
      }
      catch (error) {
        console.error("Error when finding path:", error);
      }
      finally {
        loading.value = false; // Hide loading
      }
    }
    // test click action
    const toggleTest = (index) => {
      expandedTestIndex.value = expandedTestIndex.value === index ? null : index;


      nextTick(() => {
        const elements = document.querySelectorAll('.highlight-error');
        if (elements.length > 0) {
          elements[0].scrollIntoView({ behavior: 'smooth', block: 'center' });
        }
      });
    };
    // Compile button action
    const compileCode = async () => {
      if (!editor) return;
      loading.value = true; // Show loading

      const codeContent = editor.getValue();

      try {
        const response = await fetch(`${API_URL}/compile`, {
          method: "POST",
          headers: { "Content-Type": "application/json" },
          body: JSON.stringify({ code: codeContent }),
        });

        const result = await response.json();
        loading.value = false; // Hide loading

        if (result.compile === "fail") {
          highlightErrorLine(result.errline, result.errmsg);
          compile.value = "Compilation failed: " + JSON.stringify(result.errmsg);
        } else {
          clearErrorMarkers();
          compile.value = "Compilation successful!";
        }
      } catch (error) {
        loading.value = false;
        compile.value = "Compilation request failed." + JSON.stringify(error);
      }
    };
    // Submit button action
    const submitCode = async () => {
      if (!editor) return;
      loading.value = true; // Show loading
      treeAvailable.value = false; // Reset tree availability

      const codeContent = editor.getValue();

      try {
        const response = await fetch(`${API_URL}/submit`, {
          method: "POST",
          headers: { "Content-Type": "application/json" },
          body: JSON.stringify({ code: codeContent }),
        });

        const result = await response.json();
        submitResult.value = result;
        loading.value = false; // Hide loading

        if (result.compile === "fail") {
          highlightErrorLine(result.errline, result.errmsg);
          compile.value = "Compile failed: " + JSON.stringify(result.errmsg);
        } else {
          clearErrorMarkers();
          compile.value = "Compile Succeeded: ";
          paths.value = Object.entries(result.message.paths).map(([pathId, pathObj], index)=>({
            index,
            pathId,
            variant: pathObj["path-variant"],
            tests: pathObj["generated-tests"] ? pathObj["generated-tests"].map(test => ({
              errid: test.errid,
              errline: test.errline,
              errmsg: test.errmsg.replace(" b'", "").replace("\n", "<br />"),
              code: test.test.replace('// write you code here\n', ''),
              status: test.status.toLowerCase(),
              prompt: test.prompt // Include prompt
            })) : []
          }));
          selectedPathIndex.value = null;
          tests.value=[];
          treeAvailable.value = true;
          showTree();
        }
      } catch (error) {
        loading.value = false;
        paths.value = JSON.stringify(error);
      }
    };
    // Show Tree button action
    const showTree = async () => {

      if (!submitResult.value) {
        console.error("Tree is not available or submitResult is null.");
        return;
      }

      function wrapText(text, maxLength) {
        if (text.length > maxLength) {
          return text.substring(0, maxLength) + "...";
        }
        return text;
      }

      function cleanTreeData(obj) {
        if (obj === null) return {}; // Replace null with an empty object
        if (Array.isArray(obj)) return obj.map(cleanTreeData);
        if (typeof obj === "object") {
            return Object.fromEntries(
                Object.entries(obj)
                    .map(([key, value]) => [key, cleanTreeData(value)])
            );
        }
        return obj;
      }

      function drawTree(data) {
        if (!svgRef.value) {
          console.error("SVG element not found! Check if it's mounted.");
          return;
        }

        d3.select(svgRef.value).selectAll("*").remove();

        // Dynamically scale the width and height based on the tree size
        const nodeWidth = 90;  // Horizontal spacing between levels
        const nodeHeight = 80; // Vertical spacing between levels

        // Build the hierarchy first so we can compute width/height
        const hierarchyData = d3.hierarchy(data, (d) => {
          let children = [];

          // Defensive checks for valid child node types
          if (d && d.type === "branch") {
            if (
              d["true-branch"] &&
              typeof d["true-branch"] === "object" &&
              d["true-branch"].type
            ) {
              children.push(d["true-branch"]);
            }
            if (
              d["false-branch"] &&
              typeof d["false-branch"] === "object" &&
              d["false-branch"].type
            ) {
              children.push(d["false-branch"]);
            }
          } else if (d && d.type === "statement" && d.next) {
            children.push(d.next);
          } else if (d && d.type === "end") {
            return null; // End nodes have no children
          }

          return children.length > 0 ? children : null;
        });

        const width = hierarchyData.height * nodeWidth + 400;
        const height = hierarchyData.height * nodeHeight + 400;

        // Create an SVG container with zoom enabled
        const zoom = d3.zoom()
          .scaleExtent([0.1, 2])
          .on("zoom", function (event) {
            svgGroup.attr("transform", event.transform);
          });

        const svg = d3.select(svgRef.value)
          .attr("width", width)
          .attr("height", height)
          .call(zoom);
        // Group that holds the tree
        const svgGroup = svg.append("g").attr("transform", "translate(50, 50)");

        const treeLayout = d3.tree().size([width - 200, height - 200]);
        treeLayout(hierarchyData);

        // Draw links
        svgGroup.selectAll(".link")
          .data(hierarchyData.links())
          .enter()
          .append("line")
          .attr("class", "link")
          .attr("stroke", "black")
          .attr("stroke-width", 2)
          .attr("x1", (d) => d.source.x)
          .attr("y1", (d) => d.source.y)
          .attr("x2", (d) => d.target.x)
          .attr("y2", (d) => d.target.y);

        svgGroup.selectAll(".link-label")
          .data(
            hierarchyData.links().filter(d => d.source.data.type === "branch")
          )
          .enter()
          .append("text")
          .attr("class", "link-label")
          .attr("text-anchor", "middle")
          .attr("font-size", "16px")
          .attr("fill", "black")
          .attr("x", d => (d.source.x + d.target.x) / 2)
          .attr("y", d => (d.source.y + d.target.y) / 2 - 6)
          .text(d => {
            const src = d.source.data;
            const isTrue = src["true-branch"] && src["true-branch"] === d.target.data;
            return isTrue ? "True" : "False";
          });

        // Add drag behavior to nodes
        const drag = d3.drag()
          .on("start", function (event, d) {
            d3.select(this).raise().attr("stroke", "black");
          })
          .on("drag", function (event, d) {
            d.x = event.x;
            d.y = event.y;
            d3.select(this).attr("transform", `translate(${d.x}, ${d.y})`);

            // Update connected links
            svgGroup.selectAll(".link")
              .attr("x1", (l) => l.source.x)
              .attr("y1", (l) => l.source.y)
              .attr("x2", (l) => l.target.x)
              .attr("y2", (l) => l.target.y);
            svgGroup.selectAll(".link-label")
              .attr("x", l => (l.source.x + l.target.x) / 2)
              .attr("y", l => (l.source.y + l.target.y) / 2 - 6);
          });

        // Draw nodes (nodes is predefined in the function, accessible from selectPath)
        nodes = svgGroup.selectAll(".node")
          .data(hierarchyData.descendants())
          .enter()
          .append("g")
          .attr("class", "node")
          .attr("transform", (d) => `translate(${d.x}, ${d.y})`)
          .call(drag);

        nodes.each(function (d) {
          const node = d3.select(this);

          if (d.data.type === "branch") {
            // Diamond for branch
            node.append("polygon")
              .attr("points", "-40,0 0,-40 40,0 0,40")
              .attr("fill", "orange")
              .attr("stroke", "black")
              .attr("stroke-width", 2);

            node.append("text")
              .attr("text-anchor", "middle")
              .attr("dy", 5)
              .attr("font-size", "16px")
              .attr("fill", "black")
              .text(d.data.branch);
          } else if (d.data.type === "statement") {
            // Rectangle for statement
            node.append("rect")
              .attr("x", -50)
              .attr("y", -20)
              .attr("width", 100)
              .attr("height", 40)
              .attr("fill", "lightblue")
              .attr("stroke", "black")
              .attr("stroke-width", 2);

            node.append("text")
              .attr("text-anchor", "middle")
              .attr("dy", 5)
              .attr("font-size", "16px")
              .attr("fill", "black")
              .text(wrapText(d.data.statement, 30, 12));
          } else if (d.data.type === "end") {
            console.log(d.data["status"].toUpperCase());
            // Circle for end node
            node.append("circle")
              .attr("r", 20)
              .attr("fill", () => {
                const status = (d.data["status"] || "").toUpperCase();
                if (status === "PASS") return "green";
                if (status === "ERROR") return "red";
                if (status === "UNSAT") return "gray";
                return "lightgray"; // fallback
              })
              .attr("stroke", "black")
              .attr("stroke-width", 2)
              .on("click", (event, d) => {
                const pathId = d.data["path-id"];
                if (!pathId) return;

                const idNumber = pathId.split(".")[1];
                const index = paths.value.findIndex(p =>
                  p.pathId === pathId
                );

                if (index !== -1) {
                  selectPath(index);
                }
              });

            node.append("text")
              .attr("text-anchor", "middle")
              .attr("dy", 5)
              .attr("font-size", "16px")
              .attr("fill", "white")
              .text(d.data.pathId);
          }
        });

        // Highlight direct parent-child path to root on node hover

        /** 判断 linkData 是否位于 targetNode → root 的链上 */
        function isLinkInPath(linkData, targetNode) {
          if (!targetNode) return false;
          let cur = targetNode;
          while (cur.parent) {
            if (linkData.source === cur.parent && linkData.target === cur) {
              return true;
            }
            cur = cur.parent;
          }
          return false;
        }

        function highlightPath(targetNode) {
          svgGroup.selectAll(".link")
            .attr("stroke",     linkData => isLinkInPath(linkData, targetNode) ? "orange" : "black")
            .attr("stroke-width", linkData => isLinkInPath(linkData, targetNode) ? 6 : 2);
        }

        nodes.on("mouseover", function (event, d) {
          console.log(d);
          highlightPath(d);
        }).on("mouseout", function () {
          highlightPath(null);
          if (selectedPathIndex.value === null) return ;
          const pathId = paths.value[selectedPathIndex.value]?.pathId;
          if (!pathId) return ;
          nodes.each(function (node) {
            // console.log(node.data);
            if (node.data["path-id"] === pathId) {
              highlightPath(node);
              return ;
            }
          });
          return ;
        });

        // Auto-fit tree into the visible area
        const gBBox = svgGroup.node().getBBox();
        const containerWidth = svgRef.value.clientWidth;
        const containerHeight = svgRef.value.clientHeight;

        const scale = Math.min(
          containerWidth / gBBox.width,
          containerHeight / gBBox.height,
          1
        );

        const translateX = (containerWidth - gBBox.width * scale) / 2 - gBBox.x * scale;
        const translateY = (containerHeight - gBBox.height * scale) / 2 - gBBox.y * scale;

        svg.transition()
          .duration(750)
          .call(zoom.transform, d3.zoomIdentity.translate(translateX, translateY).scale(scale));
      }

      try {
        // Fetch tree data from the backend
        const response = await fetch(`${API_URL}/getTree`, {
          method: "POST",
          headers: {"Content-Type": "application/json"},
          body: JSON.stringify({paths: submitResult.value.message.paths || []}),
        });
        if (!response.ok) {
          throw new Error("Failed to fetch tree data.");
        }
        const treeData = await response.json();
        showTreeVisualizer.value = true;
        const cleanedTreeData = cleanTreeData(treeData);
        drawTree(cleanedTreeData);
      }
      catch (error) {
        console.error("Error fetching tree data:", error);
      }
      finally {
        loading.value = false;
      }
    }

    onMounted(() => {
      const editorContainer = document.getElementById("monaco-editor");
      if (!editorContainer) return;

      editor = monaco.editor.create(editorContainer, {
        value: `public class TUTORIAL {
  public static boolean tutorial(int x, int y, int z) {
    if (x > 0) z = -z - 5; // branch B0 
    if (y + z > 0) return true; // branch B1 
   else return false;
  }
}`,
        language: "java",
        theme: "vs",
        automaticLayout: true,
        fontSize: 13,
        lineNumbersMinChars: 2,
        minimap: { enabled: false },
      });

      // Fetch examples from local JSON file
      fetch("/user_study/programs.json")
        .then((res) => res.json())
        .then((data) => {
          examples.value = data;
        })
        .catch((err) => {
          console.error("Failed to load examples:", err);
        });
    });

    // watch for editor changes, selectedPathIndex, and testToVerify changes, clear verifyResult
    watch([() => editor.getValue(), selectedPathIndex, testToVerify], () => {
      verifyResult.value = null; // Clear verify result on changes
    });

    return {
      getLineClass, compile, expandedTestIndex, compileCode, submitCode, selectPath, toggleTest,
      selectedPathIndex, paths, tests, loading, showTree, svgRef, treeAvailable, showTreeVisualizer,
      examples, loadExample, verifyTest, testToVerify, verifyResult, findPath
    };
  },
};
</script>

<style scoped>
/* Reset Defaults */
html, body {
  margin: 0;
  padding: 0;
  height: 100vh;
  width: 100vw;
  box-sizing: border-box;
  transition: background-color 0.3s ease-in-out, color 0.3s;
}

/* Added prompt-display style */
.prompt-display {
  width: 100%;
  height: calc(100% - 50px);
  overflow-y: auto;
  background: #f0f0f0;
  padding: 10px;
  border: 1px solid #ccc;
  border-radius: 5px;
  white-space: pre-wrap;
  word-wrap: break-word;
  font-family: sans-serif;
}


/* Main Layout */
.container {
  display: flex;
  height: 100vh;
  width: 100vw;
  justify-content: space-between;
  transition: background-color 0.3s;
}


/* Navbar */
.navbar {
  width: 100%;
  height: 60px;
  background-color: #343a40;
  color: white;
  display: flex;
  align-items: center;
  justify-content: center;
  font-size: 20px;
  font-weight: bold;
  border-bottom: 5px solid #007bff;
  position: fixed;
  left: 0;
  z-index: 100;
}


/* Code Editor */
.code-editor {
  position: fixed;
  top: 60px;
  left: 0;
  width: 35%;
  height: calc(100% - 64px);
  border-right: 2px solid #ccc;
}

/* Buttons */
.button-container {
  position: fixed;
  bottom: 20px;
  left: 20px;
  display: flex;
  gap: 10px;
}
/* compile status*/
#compile{
  position: fixed;
  width: 45%;
  top: 67%;
  height: 3%;
  padding: 10px;
  border: 1pt solid #ccc;
  border-radius: 5px;
  display: flex;
  flex-direction: column;
  align-items: center;
}

/* Generate Button */
.action-button {
  padding: 12px 20px;
  font-size: 18px;
  font-weight: bold;
  cursor: pointer;
  background-color: #007bff;
  color: white;
  border: none;
  border-radius: 5px;
  transition: background-color 0.3s ease-in-out, transform 0.2s;
  z-index: 999;
}

.action-button:hover {
  background-color: #0056b3;
  transform: scale(1.05);
}



.action-button:disabled {
  background-color: gray;
  cursor: not-allowed;
}

/* Paths Area */
.path-form {
  position: fixed;
  top: 60px;
  left: 30%;
  width: 45%;
  height: calc(100% - 64px);
  padding: 20px;
  background-color: #f8f9fa;
  border-left: 1px solid #ccc;
  display: flex;
  flex-direction: column;
  align-items: center;
}


/* Scrollable Path Container */
.path-list-container {
  position: absolute;
  bottom: 10px;
  width: 100%;
  background: #f8f9fa;
  padding: 5px;
  border: 1px solid #ccc;
  border-radius: 5px;
  height: 30%;
  overflow-y: auto;
}


/* List Styles */
.path-list {
  list-style: none;
  padding: 0;
  margin: 0;
}

/* Path Box Styling */
.path-box {
  padding: 10px;
  border: 1px solid #ddd;
  border-radius: 5px;
  cursor: pointer;
  transition: background 0.3s;
}

.path-box:hover {
  background: #e0e0e0;
}

/* Preview Styling */
.path-preview {
  font-size: 10pt;
  color: #007bff;
}

/* Highlight Selected Path */
.selected-path .path-box {
  background: #bad6f6;
  font-size: 10pt;
  font-weight: bold;
  overflow-y: auto;
  padding: 10px;
  border: 1px solid #ddd;
  border-radius: 5px;
  transition: background 0.3s;
}


/* Tests Area */
.test-form {
  position: fixed;
  top: 60px;
  left: 75%;
  width: 25%;
  height: calc(70% - 64px);
  padding: 20px;
  background-color: #f8f9fa;
  border-left: 2px solid #ccc;
  display: flex;
  flex-direction: column;
  align-items: center;
}

/* Test Verify Styling */
.test-verify {
  position: fixed;
  bottom: 30%;
  left: 75%;
  width: 25%;
  height: 30%;
  padding: 20px;
  flex-direction: column;
  display: flex;
  background-color: #f8f9fa;
  border-left: 2px solid #ccc;
  align-items: center;
}

.verify-textarea {
  width: 100%;
  height: 80%;
  box-sizing: border-box;
  padding: 10px;
  border: 1px solid #ccc;
  border-radius: 5px;
  font-family: monospace;
  resize: vertical;
  background: #f8f9fa;
  align-items: center;
}

.verify-box {
  height: 100%;
  width: 100%;
  padding: 10px;
  border: 1pt solid #ccc;
  border-radius: 5px;
  background-color: #f8f9fa;
  font-weight: bold;
  font-family: monospace;
  font-size: 12pt;
} 
/* Buttons for verify and findPath */
.button-verify {
  margin-top: auto;
  display: flex;
  gap: 10px;
}

.prompt-box {
  position: fixed;
  bottom: 0;
  left: 75%;
  width: 25%;
  height: 30%;
  padding: 10px;
  background-color: #f8f9fa;
  border-left: 2px solid #ccc;
  border-top: 2px solid #ccc;
  overflow-y: auto;
  box-sizing: border-box;
  z-index: 10;
}

/* Scrollable Test Container */
.test-list-container {
  width: 100%;
  overflow-y: auto;
  padding: 5px;
  border: 1px solid #ccc;
  border-radius: 5px;
}

/* List Styles */
.test-list {
  list-style: none;
  padding: 0;
  margin: 0;
}

/* Test Box Styling */
.test-box {
  padding: 10px;
  border: 1px solid #ddd;
  border-radius: 5px;
  cursor: pointer;
  transition: background 0.3s;
}

.test-box:hover {
  background: #e0e0e0;
}


/* Preview Styling */
.test-preview {
  font-weight: bold;
  color: #007bff;
  background: #A5D6D9;
}

/* Highlight Selected Test */
.test-pass {
  background-color: #28a745; /* Green */
  font-weight: bold;
}

.test-fail {
  background-color: #dc3545; /* Red */
  font-weight: bold;
}

.test-unsat {
  background-color: #6c757d; /* Gray */
  font-weight: bold;
}

/* Preserve formatting for test cases */
.test-box pre {
  white-space: pre-wrap;
  word-wrap: break-word;
  background: #f8f9fa;
  border: 1pt solid;
  padding: 10px;
  border-radius: 5px;
  font-family: monospace;
}

/* Loading Overlay */
.loading-overlay {
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background: rgba(0, 0, 0, 0.6);
  display: flex;
  justify-content: center;
  align-items: center;
  color: white;
  font-size: 20px;
  z-index: 999;
}

.error-message {
  white-space: pre-wrap;  /* Ensures newlines (`\n`) are preserved */
  word-wrap: break-word;  /* Prevents long lines from overflowing */
  background: #ffdddd;    /* Light red background for errors */
  color: #b30000;         /* Dark red text */
  padding: 10px;
  border-radius: 5px;
  font-weight: bold;
}

/* Spinner */
.spinner {
  border: 5px solid rgba(255, 255, 255, 0.3);
  border-top: 5px solid #fff;
  border-radius: 50%;
  width: 50px;
  height: 50px;
  animation: spin 1s linear infinite;
}

@keyframes spin {
  100% { transform: rotate(360deg); }
}

.tree-visualizer {
    position: fixed;
    left: calc(30% + 1px);
    top: 60px;
    width: 45vw;
    height: 60%;
    background: rgba(255, 255, 255, 0.8);
    overflow: auto; /* allow scroll if needed */
    z-index: 10; /* lower priority so it does not block buttons */
    pointer-events: auto;
}

.tree-visualizer svg {
  width: 100%;
  height: 100%;
}

.node polygon,
.node rect,
.node circle {
  cursor: pointer;
}
.node text {
  font: 16px sans-serif;
}
.link {
  fill: none;
  stroke: black;
  stroke-width: 2px;
}
.code-line {
  font-family: monospace;
  white-space: pre;
  display: block;
  line-height: 1.5em;
}

.highlight-error {
  background-color: #ffd6d6;
  border-left: 4px solid red;
  white-space: pre;
  text-indent: -4px;
  font-family: monospace;
}

.example-selector {
  position: fixed;
  left: 10px;
  padding: 5px 8px;
  border-radius: 4px;
  border: 1px solid #ccc;
  z-index: 101; /* Just above the navbar (z-index: 100) */
}

.example-selector label {
  margin-right: 5px;
  font-weight: bold;
}

</style>
