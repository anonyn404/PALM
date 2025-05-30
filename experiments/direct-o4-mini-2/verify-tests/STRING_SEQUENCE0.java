import java.util.*;
public class STRING_SEQUENCE0 {

    public static String string_sequence(int n) {
        String result = "";
        for (int i = 0; i <= n; i += 1) {
            result += i + " ";
        }
        return result.trim();
    }
public void my_test() {string_sequence(-1);
}
}