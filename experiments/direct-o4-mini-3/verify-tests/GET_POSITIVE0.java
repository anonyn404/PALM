import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class GET_POSITIVE0 {

    public static List<Integer> get_positive(List<Integer> numbers) {
        List<Integer> result = new ArrayList<Integer>();
        for (Integer number : numbers) {
            if (number > 0) {
                result.add(number);
            }
        }
        return result;
    }
public void my_test() {GET_POSITIVE0.get_positive(java.util.Collections.emptyList());
}
}