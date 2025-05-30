import java.util.*;
public class HOW_MANY_TIMES22 {

    public static int how_many_times(String string, String substring) {
        int times = 0;
        for (int i = 0; i < string.length() - substring.length() + 1; i += 1) {
            if (string.substring(i, i + substring.length()).equals(substring)) {
                times += 1;
            }
        }
        return times;
    }
public void my_test() {HOW_MANY_TIMES22.how_many_times("123456789", "345");
}
}