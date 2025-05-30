import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class TRIANGLE_AREA_223 {

    public static double triangle_area_2(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a)
            return -1;
        double s = (a + b + c) / 2.;
        double result = Math.pow(s * (s - a) * (s - b) * (s - c), 0.5);
        BigDecimal bd = BigDecimal.valueOf(result);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
public void my_test() {TRIANGLE_AREA_223.triangle_area_2(1, 2, 2);
}
}