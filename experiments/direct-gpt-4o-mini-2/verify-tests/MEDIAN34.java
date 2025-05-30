import java.util.*;
import java.util.Arrays;
public class MEDIAN34 {

    public static double median(int[] list) {
        Arrays.sort(list);
        if (list.length % 2 == 1) {
            return list[(int) (list.length / 2)];
        } else {
            return (list[(int) (list.length / 2)] + list[(int) (list.length / 2) - 1]) / 2.;
        }
    }
public void my_test() {MEDIAN34.median(new int[]{0, 9, 1});
}
}