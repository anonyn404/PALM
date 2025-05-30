import java.util.*;
public class ADD_EVEN_AT_ODD3 {

    public static int add_even_at_odd(int[] lst) {
        int sum = 0;
        for (int i = 1; i < lst.length; i += 2) {
            if (lst[i] % 2 == 0)
                sum += lst[i];
        }
        return sum;
    }
public void my_test() {ADD_EVEN_AT_ODD3.add_even_at_odd(new int[]{0,3,0,4});
}
}