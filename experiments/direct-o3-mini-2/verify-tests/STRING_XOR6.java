import java.util.*;
public class STRING_XOR6 {

    public static String string_xor(String a, String b) {
        String result = "";
        for (int i = 0; i < a.length(); i += 1) {
            if (a.charAt(i) == b.charAt(i)) {
                result += "0";
            } else {
                result += "1";
            }
        }
        return result;
    }
public void my_test() {STRING_XOR6.string_xor("ab", "cd");
}
}