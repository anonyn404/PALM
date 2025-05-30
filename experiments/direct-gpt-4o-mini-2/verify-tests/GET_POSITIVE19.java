import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class GET_POSITIVE19 {

    public static List<Integer> get_positive(List<Integer> numbers) {
        List<Integer> result = new ArrayList<Integer>();
        for (Integer number : numbers) {
            if (number > 0) {
                result.add(number);
            }
        }
        return result;
    }
public void my_test() {get_positive(Arrays.asList(-1, -2, 4));
}
}