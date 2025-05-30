import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
public class GET_ODD_COLLATZ38 {

    public static ArrayList<Integer> get_odd_collatz(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        if ((n % 2) == 1)
            result.add(n);
        while (n > 1) {
            if ((n % 2) == 0)
                n /= 2;
            else
                n = 3 * n + 1;
            if ((n % 2) == 1)
                result.add(n);
        }
        Collections.sort(result);
        return result;
    }
public void my_test() {GET_ODD_COLLATZ38.get_odd_collatz(34);
}
}