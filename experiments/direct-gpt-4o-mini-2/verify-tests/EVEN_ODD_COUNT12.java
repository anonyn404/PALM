import java.util.*;
public class EVEN_ODD_COUNT12 {

    public static int[] even_odd_count(int num) {
        int even_count = 0;
        int odd_count = 0;
        for (char c : (Math.abs(num) + "").toCharArray()) {
            int n = c - '0';
            if (n % 2 == 0)
                even_count += 1;
            if (n % 2 == 1)
                odd_count += 1;
        }
        return new int[] { even_count, odd_count };
    }
public void my_test() {EVEN_ODD_COUNT12.even_odd_count(-13);
}
}