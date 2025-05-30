import java.util.*;
public class DIGIT_SUM42 {

    public static int digit_sum(String s) {
        int result = 0;
        for (char c : s.toCharArray()) {
            if ('A' <= c && c <= 'Z')
                result += (int) c;
        }
        return result;
    }
public void my_test() {DIGIT_SUM42.digit_sum("B");
}
}