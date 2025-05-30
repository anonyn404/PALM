import java.util.*;
public class SUM_SQUARED_NUMS33 {

    public static long sum_squared_nums(double[] lst) {
        int result = 0;
        for (int i = 0; i < lst.length; i++) {
            result += (Math.ceil(lst[i])) * (Math.ceil(lst[i]));
        }
        return result;
    }
public void my_test() {SUM_SQUARED_NUMS33.sum_squared_nums(new double[]{0.5, 1.5, -2.5});
}
}