import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class STRANGE_SORT_LIST1 {

    public static List<Integer> strange_sort_list(List<Integer> lst) {
        List<Integer> result = new ArrayList<Integer>();
        boolean switched = true;
        while (lst.size() > 0) {
            if (switched) {
                result.add(Collections.min(lst));
            } else {
                result.add(Collections.max(lst));
            }
            lst.remove(result.get(result.size() - 1));
            switched = (!switched);
        }
        return result;
    }
public void my_test() {strange_sort_list(Arrays.asList(1, 2));
}
}