import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class INCR_LIST12 {

    public static List<Integer> incr_list(List<Integer> l) {
        List<Integer> result = new ArrayList<Integer>();
        for (Integer n : l) {
            result.add(n + 1);
        }
        return result;
    }
public void my_test() {INCR_LIST12.incr_list(Arrays.asList(2));
}
}