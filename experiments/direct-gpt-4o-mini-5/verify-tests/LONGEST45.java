import java.util.*;
import java.util.List;
public class LONGEST45 {

    public static String longest(List<String> strings) {
        int maxlen = 0;
        for (String string : strings) {
            if (string.length() > maxlen) {
                maxlen = string.length();
            }
        }
        for (String string : strings) {
            if (string.length() == maxlen) {
                return string;
            }
        }
        return null;
    }
public void my_test() {LONGEST45.longest(Arrays.asList("testing", "one", "two", "three"));
}
}