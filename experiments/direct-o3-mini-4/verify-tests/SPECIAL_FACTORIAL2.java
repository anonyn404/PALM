import java.util.*;
public class SPECIAL_FACTORIAL2 {

    public static long special_factorial(long n) {
        long fact_i = 1, special_fact = 1;
        for (int i = 1; i <= n; i++) {
            fact_i *= i;
            special_fact *= fact_i;
        }
        return special_fact;
    }
public void my_test() {special_factorial(1);
}
}