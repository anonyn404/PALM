import java.util.*;
public class MODP0 {

    public static int modp(int n, int p) {
        int result = 1;
        for (int i = 0; i < n; i += 1) {
            result = (2 * result) % p;
        }
        return result;
    }
public void my_test() {MODP0.modp(4, 9);
}
}