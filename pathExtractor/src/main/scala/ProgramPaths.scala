import Configs._
import scala.collection.mutable.ListBuffer
object ProgramPaths {
    val BREAK = 0 // skip entire loop body
    val NORMAL = 1 // normal
    val CONTINUE = 2 // skip following
    val RETURN = 3 // terminate

    type Paths = List[(String, Int)]
    type PathsBuffer = ListBuffer[(String, Int)]
    def compose(lpath: String, rpath: String): String = {
        if (lpath == "") return rpath
        else if (rpath == "") return lpath
        else return lpath + "\n" + rpath
    }

    def sequential_prod(ls: Paths, rs: Paths) : Paths = {
        var ret: PathsBuffer = ListBuffer.empty[(String, Int)]

        for ((l, ltype) <- ls)
        if (ltype == NORMAL) {
            for ((r, rtype) <- rs)
                ret += ((compose(l, r), rtype))
        }
        else {
            ret += ((l, ltype))
        }
        
        return ret.toList.take(_max_paths * 5)
    }
    def sequential_prod(l: String, rs: Paths) : Paths = {
        return sequential_prod(List((l, NORMAL)), rs)
    }
    def sequential_prod(ls: Paths, r: String) : Paths = {
        return sequential_prod(ls, List((r, NORMAL)))
    }
    def loop_lift(ls: Paths) : (Paths, Paths) = {
        var ret_active: PathsBuffer = ListBuffer.empty[(String, Int)]
        var ret_dead: PathsBuffer = ListBuffer.empty[(String, Int)]
        for ((l, ltype) <- ls) {
            if (ltype == NORMAL || ltype == CONTINUE)
                ret_active += ((l, NORMAL))
            else if (ltype == RETURN)
                ret_dead += ((l, RETURN))
            else 
                ret_dead += ((l, NORMAL))
        }

        var _ret_active = ret_active.toList.take(_max_paths * 5)
        var _ret_dead = ret_dead.toList.take(_max_paths * 5)
        if (_add_loop_guard) {
            // add parenthesis
            _ret_active = add_parenthesis(_ret_active)
            _ret_dead = add_parenthesis(_ret_dead)
        }
        return (_ret_active, _ret_dead)
    }

    def add_parenthesis(ls: Paths): Paths = {
        var ret: PathsBuffer = ListBuffer.empty[(String, Int)]
        for ((l, ltype) <- ls) {
            ret += (("{\n" + l + "\n}", ltype))
        }
        return ret.toList.take(_max_paths * 5)
    }
}