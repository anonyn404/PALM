import java.util.*;
import java.util.List;
public class HAS_CLOSE_ELEMENTS20 {

    public static boolean has_close_elements(List<Double> numbers, double threshold) {
        for (int i = 0; i < numbers.size(); i += 1) {
            for (int j = i + 1; j < numbers.size(); j += 1) {
                double distance = Math.abs(numbers.get(i) - numbers.get(j));
                if (distance < threshold)
                    return true;
            }
        }
        return false;
    }
public void my_test() {HAS_CLOSE_ELEMENTS20.has_close_elements(Arrays.asList(3.5), 1.0);
}
}