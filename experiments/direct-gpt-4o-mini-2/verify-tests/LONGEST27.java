import java.util.*;
import java.util.List;
public class LONGEST27 {

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
public void my_test() {longest(Arrays.asList("first", "second", "third"));
}
}