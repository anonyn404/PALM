import java.util.*;
import java.util.List;
public class SUM_PRODUCT26 {

    public static Integer[] sum_product(List<Integer> numbers) {
        Integer[] result = new Integer[] { 0, 1 };
        for (Integer n : numbers) {
            result[0] += n;
            result[1] *= n;
        }
        return result;
    }
public void my_test() {sum_product(Arrays.asList(2));
}
}