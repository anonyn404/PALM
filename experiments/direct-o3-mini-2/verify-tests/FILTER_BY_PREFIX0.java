import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class FILTER_BY_PREFIX0 {

    public static List<String> filter_by_prefix(List<String> strings, String prefix) {
        List<String> result = new ArrayList<String>();
        for (String string : strings) {
            if (string.startsWith(prefix)) {
                result.add(string);
            }
        }
        return result;
    }
public void my_test() {filter_by_prefix(Arrays.asList("x1", "x2"), "ab");
}
}