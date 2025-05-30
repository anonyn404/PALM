import java.util.*;
public class COUNT_UPPER19 {

    public static int count_upper(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i += 2) {
            char c = s.charAt(i);
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
                count += 1;
        }
        return count;
    }
public void my_test() {COUNT_UPPER19.count_upper("XYZ");
}
}