import java.util.*;
public class PRIME_LENGTH45 {

    public static boolean prime_length(String string) {
        int l = string.length();
        if (l <= 1)
            return false;
        for (int i = 2; i < l; i += 1) {
            if (l % i == 0)
                return false;
        }
        return true;
    }
public void my_test() {PRIME_LENGTH45.prime_length("xyzxyz");
}
}