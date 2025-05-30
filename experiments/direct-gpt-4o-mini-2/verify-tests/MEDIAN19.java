import java.util.*;
import java.util.Arrays;
public class MEDIAN19 {

    public static double median(int[] list) {
        Arrays.sort(list);
        if (list.length % 2 == 1) {
            return list[(int) (list.length / 2)];
        } else {
            return (list[(int) (list.length / 2)] + list[(int) (list.length / 2) - 1]) / 2.;
        }
    }
public void my_test() {MEDIAN19.median(new int[]{-9, 0});
}
}