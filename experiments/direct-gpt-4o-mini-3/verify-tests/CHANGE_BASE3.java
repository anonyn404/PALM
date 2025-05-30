import java.util.*;
public class CHANGE_BASE3 {

    public static String change_base(int x, int base) {
        String result = "";
        while (x > 0) {
            result = (x % base) + result;
            x = (int) x / base;
        }
        return result;
    }
public void my_test() {change_base(4, 4);
}
}