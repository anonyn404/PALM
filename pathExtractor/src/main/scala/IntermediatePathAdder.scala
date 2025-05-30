
import ProgramPaths._
object IntermediatePathAdder {
    // mutable set of paths
    val pathsets = scala.collection.mutable.Set[String]()
    val parents = scala.collection.mutable.Map[String, String]()
    def removeLastAssertion(path: String): (String, String) = {
        // get the last assertTrue or assertFalse
        val lastIndexTrue = path.lastIndexOf("assertTrue")
        val lastIndexFalse = path.lastIndexOf("assertFalse")
        val lastIndex = {if (lastIndexTrue > lastIndexFalse) lastIndexTrue else lastIndexFalse}
        if (lastIndex == -1) return ("", "")

        // split the path into two parts: before the assertion and the assertion itself
        //  there might be more statements after the assertion
        val beforeAssertion = path.substring(0, lastIndex).trim
        val endIndex = path.indexOf(";", lastIndex + 1)
        val assertion = path.substring(0, endIndex + 1).trim
        return (beforeAssertion, assertion)
    }
    def add_intermediate_paths(paths: Paths) = {
        pathsets.clear()
        parents.clear()
        // make a set of (unique) intermediate paths
        for (path <- paths) {
            // each path is a sequence of statements; 
            // find all assertTrue and assertFalse
            //  e.g. [b0] assertTrue(..) [b1] assertfalse(..) [b2]
            //  we add paths {[b0 assertTrue], [b0..b1 assertfalse].. [b0..b2]}
            var child = path._1
            var cur = removeLastAssertion(path._1)._1
            var toContinue = true

            if (pathsets.contains(child)) toContinue = false
            else pathsets.add(child)


            while (toContinue && (! cur.isEmpty)) {
                val (beforeAssertion, withAssertion) = removeLastAssertion(cur)
                if (withAssertion.isEmpty) toContinue = false
                else {
                    // add the path to the set
                    val newPath = withAssertion.trim()
                    parents(child) = newPath
                    if (pathsets.contains(newPath)) toContinue = false
                    else {
                        pathsets.add(newPath)
                        child = newPath
                        cur = beforeAssertion.trim()
                    }
                }
            }
        }
    }
}