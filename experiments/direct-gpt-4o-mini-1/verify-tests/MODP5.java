import java.util.*;
public class MODP5 {

    public static int modp(int n, int p) {
        int result = 1;
        for (int i = 0; i < n; i += 1) {
            result = (2 * result) % p;
        }
        return result;
    }
public void my_test() {MODP5.modp(2, 5);
}
}