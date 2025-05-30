import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class FILTER_INTEGERS20 {

    public static List<Integer> filter_integers(List<Object> values) {
        List<Integer> result = new ArrayList<Integer>();
        for (Object value : values) {
            if (value instanceof Integer) {
                result.add((Integer) value);
            }
        }
        return result;
    }
public void my_test() {FILTER_INTEGERS20.filter_integers(Arrays.asList("not an integer", new Integer(3), new Integer(8)));
}
}