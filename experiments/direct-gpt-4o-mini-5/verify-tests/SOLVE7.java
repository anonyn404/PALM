import java.util.*;
public class SOLVE7 {

    public static String solve(int N) {
        int sum = 0;
        for (int i = 0; i < (N + "").length(); i += 1) {
            sum += Integer.parseInt((N + "").substring(i, i + 1));
        }
        return Integer.toBinaryString(sum);
    }
public void my_test() {SOLVE7.solve(9);
}
}