import java.util.*;
public class SUM_SQUARED_NUMS5 {

    public static long sum_squared_nums(double[] lst) {
        int result = 0;
        for (int i = 0; i < lst.length; i++) {
            result += (Math.ceil(lst[i])) * (Math.ceil(lst[i]));
        }
        return result;
    }
public void my_test() {sum_squared_nums(new double[]{-2.0, -3.0});
}
}