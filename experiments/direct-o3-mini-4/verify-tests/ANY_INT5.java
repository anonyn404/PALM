import java.util.*;
public class ANY_INT5 {

    public static boolean any_int(double x, double y, double z) {
        if ((int) x == x && (int) y == y && (int) z == z) {
            if (x + y == z || x + z == y || y + z == x)
                return true;
        }
        return false;
    }
public void my_test() {ANY_INT5.any_int(-1, -2, -3);
}
}