import java.util.*;
public class ANY_INT38 {

    public static boolean any_int(double x, double y, double z) {
        if ((int) x == x && (int) y == y && (int) z == z) {
            if (x + y == z || x + z == y || y + z == x)
                return true;
        }
        return false;
    }
public void my_test() {ANY_INT38.any_int(7.0, 7.0, 14.0);
}
}