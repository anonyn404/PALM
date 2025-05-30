import java.util.*;
public class IS_SIMPLE_POWER6 {

    public static boolean is_simple_power(int x, int n) {
        if (n == 1)
            return x == 1;
        int power = 1;
        while (power < x) {
            power *= n;
        }
        return power == x;
    }
public void my_test() {IS_SIMPLE_POWER6.is_simple_power(2, 3);
}
}