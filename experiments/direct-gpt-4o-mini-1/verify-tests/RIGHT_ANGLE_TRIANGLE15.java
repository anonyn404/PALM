import java.util.*;
public class RIGHT_ANGLE_TRIANGLE15 {

    public static boolean right_angle_triangle(int a, int b, int c) {
        return a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b;
    }
public void my_test() {RIGHT_ANGLE_TRIANGLE15.right_angle_triangle(3, 4, 0);
}
}