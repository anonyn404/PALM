import java.util.*;
public class HOW_MANY_TIMES48 {

    public static int how_many_times(String string, String substring) {
        int times = 0;
        for (int i = 0; i < string.length() - substring.length() + 1; i += 1) {
            if (string.substring(i, i + substring.length()).equals(substring)) {
                times += 1;
            }
        }
        return times;
    }
public void my_test() {HOW_MANY_TIMES48.how_many_times("hello", "he");
}
}