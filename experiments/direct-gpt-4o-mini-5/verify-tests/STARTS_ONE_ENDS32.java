import java.util.*;
public class STARTS_ONE_ENDS32 {

    public static int starts_one_ends(int n) {
        if (n == 1)
            return 1;
        return (int) ((10 + 9 - 1) * Math.pow(10, n - 2));
    }
public void my_test() {STARTS_ONE_ENDS32.starts_one_ends(19);
}
}