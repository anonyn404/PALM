import java.util.*;
public class LARGEST_DIVISOR5 {

    public static int largest_divisor(int n) {
        for (int i = n - 1; i >= 1; i -= 1) {
            if (n % i == 0)
                return i;
        }
        return 1;
    }
public void my_test() {largest_divisor(1);
}
}