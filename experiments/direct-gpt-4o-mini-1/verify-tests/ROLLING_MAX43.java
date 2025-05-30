import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class ROLLING_MAX43 {

    public static List<Integer> rolling_max(List<Integer> numbers) {
        List<Integer> result = new ArrayList<Integer>();
        Integer running_max = null;
        for (Integer n : numbers) {
            if (running_max == null) {
                running_max = n;
            } else {
                running_max = Math.max(running_max, n);
            }
            result.add(running_max);
        }
        return result;
    }
public void my_test() {ROLLING_MAX43.rolling_max(Arrays.asList(2, -2));
}
}