import java.util.*;
public class ANY_INT39 {

    public static boolean any_int(double x, double y, double z) {
        if ((int) x == x && (int) y == y && (int) z == z) {
            if (x + y == z || x + z == y || y + z == x)
                return true;
        }
        return false;
    }
public void my_test() {ANY_INT39.any_int(-4.0, -4.0, -8.0);
}
}