import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class INCR_LIST3 {

    public static List<Integer> incr_list(List<Integer> l) {
        List<Integer> result = new ArrayList<Integer>();
        for (Integer n : l) {
            result.add(n + 1);
        }
        return result;
    }
public void my_test() {INCR_LIST3.incr_list(null);
}
}