import java.util.*;
public class RIGHT_ANGLE_TRIANGLE13 {

    public static boolean right_angle_triangle(int a, int b, int c) {
        return a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b;
    }
public void my_test() {right_angle_triangle(5, 3, 4);
}
}