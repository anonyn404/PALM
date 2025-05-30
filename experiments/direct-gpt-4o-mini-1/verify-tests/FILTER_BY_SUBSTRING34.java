import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class FILTER_BY_SUBSTRING34 {

    public static List<String> filter_by_substring(List<String> strings, String substring) {
        List<String> result = new ArrayList<String>();
        for (String string : strings) {
            if (string.contains(substring)) {
                result.add(string);
            }
        }
        return result;
    }
public void my_test() {FILTER_BY_SUBSTRING34.filter_by_substring(Arrays.asList("apple"), "b");
}
}