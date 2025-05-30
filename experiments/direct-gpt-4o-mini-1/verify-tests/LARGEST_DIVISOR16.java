import java.util.*;
public class LARGEST_DIVISOR16 {

    public static int largest_divisor(int n) {
        for (int i = n - 1; i >= 1; i -= 1) {
            if (n % i == 0)
                return i;
        }
        return 1;
    }
public void my_test() {LARGEST_DIVISOR16.largest_divisor(102);
}
}