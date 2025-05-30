import java.util.*;
import java.util.List;
public class BELOW_ZERO2 {

    public static boolean below_zero(List<Integer> operations) {
        int balance = 0;
        for (Integer op : operations) {
            balance += op;
            if (balance < 0) {
                return true;
            }
        }
        return false;
    }
public void my_test() {below_zero(Collections.emptyList());
}
}