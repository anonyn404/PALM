import java.util.*;
public class LARGEST_SMALLEST_INTEGERS0 {

    public static int[] largest_smallest_integers(int[] lst) {
        boolean negative = false, positive = false;
        int max_negative = Integer.MIN_VALUE, min_positive = Integer.MAX_VALUE;
        for (int i = 0; i < lst.length; i++) {
            if (lst[i] < 0) {
                negative = true;
                max_negative = Math.max(max_negative, lst[i]);
            } else if (lst[i] > 0) {
                positive = true;
                min_positive = Math.min(min_positive, lst[i]);
            }
        }
        if (!negative)
            max_negative = 0;
        if (!positive)
            min_positive = 0;
        int[] result = { max_negative, min_positive };
        return result;
    }
public void my_test() {LARGEST_SMALLEST_INTEGERS0.largest_smallest_integers(new int[]{5, -5});
}
}