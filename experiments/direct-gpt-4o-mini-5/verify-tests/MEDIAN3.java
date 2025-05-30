import java.util.*;
import java.util.Arrays;
public class MEDIAN3 {

    public static double median(int[] list) {
        Arrays.sort(list);
        if (list.length % 2 == 1) {
            return list[(int) (list.length / 2)];
        } else {
            return (list[(int) (list.length / 2)] + list[(int) (list.length / 2) - 1]) / 2.;
        }
    }
public void my_test() {median(new int[]{1, 2, 4, 3});
}
}