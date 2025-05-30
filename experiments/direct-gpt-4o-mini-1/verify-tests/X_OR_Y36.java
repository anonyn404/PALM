import java.util.*;
public class X_OR_Y36 {

    public static int x_or_y(int n, int x, int y) {
        if (n == 1)
            return y;
        for (int i = 2; i < n; i += 1) {
            if (n % i == 0)
                return y;
        }
        return x;
    }
public void my_test() {X_OR_Y36.x_or_y(3, 30, 40);
}
}