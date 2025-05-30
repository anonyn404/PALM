import java.util.*;
public class GREATEST_COMMON_DIVISOR19 {

    public static int greatest_common_divisor(int a, int b) {
        while (b > 0) {
            int tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }
public void my_test() {GREATEST_COMMON_DIVISOR19.greatest_common_divisor(12, 18);
}
}