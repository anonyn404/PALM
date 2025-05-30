from flask import Flask, request, jsonify
from flask_cors import CORS
from PALM.testMaker.main import palm, get_symbolic_tree, verify_test, find_path
                
app = Flask(__name__)
CORS(app)

@app.route("/", methods=["GET", "POST"])
def get_tests():
    return jsonify({'message': "Backend Online"}), 200


@app.route('/submit', methods=['POST'])
def submit_code():
    data = request.get_json()
    code = data.get("code", "")
    print("Received Code:\n", code)

    # Simulating a backend response with test results
    # def palm(program: str, is_compile = False, is_gen = False, pcid = None) -> dict:

    status = palm(code, is_compile=True, is_gen=False)
    print(status)
    if status["compile"] == 'fail':
        return jsonify(status), 400
    elif status["compile"] == 'pass':
        result = palm(code, is_compile=True, is_gen=True)
        return jsonify({"message": result}), 200

@app.route('/compile', methods=['POST'])
def compile_code():
    data = request.get_json()
    code = data.get("code", "")
    print("Received Code:\n", code)

    # Simulating a backend response with test results
    # def palm(program: str, is_compile = False, is_gen = False, pcid = None) -> dict:

    status = palm(code, is_compile=True, is_gen=False)
    print(status)
    return jsonify(status), 200

@app.route('/getTree', methods=['POST'])
def get_tree():
    try:
        data = request.get_json()
        paths = data.get("paths", [])
        tree = get_symbolic_tree(paths)
        return jsonify(tree), 200
    except Exception as e:
        return jsonify({"message": str(e)}), 500

@app.route('/verifyTest', methods=['POST'])
def submit_test():
    try:
        data = request.get_json()
        code = data.get("code", "")
        pcid = data.get("pcid", "")
        test = data.get("test", "")
        result = verify_test(code, pcid, test + ";")
        return jsonify(result), 200
    except Exception as e:
        return jsonify({"message": str(e)}), 500
    
@app.route('/findPath', methods=['POST'])
def navigate_path():
    try:
        data = request.get_json()
        code = data.get("code", "")
        test = data.get("test", "")
        result = find_path(code, test + ";")
        return jsonify(result), 200
    except Exception as e:
        return jsonify({"message": str(e)}), 500
    
if __name__ == "__main__":
    app.run(host="0.0.0.0", port=5001, debug=True)