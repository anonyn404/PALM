import java.util.*;
public class RESCALE_TO_UNIT24 {

    public static double[] rescale_to_unit(double[] numbers) {
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        for (int i = 0; i < numbers.length; i += 1) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        double[] result = new double[numbers.length];
        for (int i = 0; i < numbers.length; i += 1) {
            result[i] = (numbers[i] - min) / (max - min);
        }
        return result;
    }
public void my_test() {rescale_to_unit(new double[]{4.0, 8.0, 7.0});
}
}