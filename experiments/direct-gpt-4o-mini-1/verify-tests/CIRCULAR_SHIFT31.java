import java.util.*;
public class CIRCULAR_SHIFT31 {

    public static String circular_shift(int x, int shift) {
        String s = x + "";
        if (shift > s.length()) {
            StringBuilder sb = new StringBuilder();
            for (int i = s.length() - 1; i >= 0; i -= 1) sb.append(s.charAt(i));
            return sb.toString();
        } else {
            return s.substring(s.length() - shift) + s.substring(0, s.length() - shift);
        }
    }
public void my_test() {CIRCULAR_SHIFT31.circular_shift(2000, 2);
}
}