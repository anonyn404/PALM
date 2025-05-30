import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class FILTER_BY_PREFIX2 {

    public static List<String> filter_by_prefix(List<String> strings, String prefix) {
        List<String> result = new ArrayList<String>();
        for (String string : strings) {
            if (string.startsWith(prefix)) {
                result.add(string);
            }
        }
        return result;
    }
public void my_test() {FILTER_BY_PREFIX2.filter_by_prefix(java.util.Arrays.asList("b", "c"), "a");
}
}