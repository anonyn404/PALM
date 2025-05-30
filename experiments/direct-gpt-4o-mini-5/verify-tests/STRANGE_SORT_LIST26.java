import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class STRANGE_SORT_LIST26 {

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
public void my_test() {STRANGE_SORT_LIST26.strange_sort_list(Arrays.asList(4, 4));
}
}