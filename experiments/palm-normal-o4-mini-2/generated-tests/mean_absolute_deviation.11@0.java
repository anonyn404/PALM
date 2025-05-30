```java
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        mean_absolute_deviation(Arrays.asList(1.0, 2.0));
    }

    public static void mean_absolute_deviation(List<Double> numbers) {
        double sum_1 = 0.;
        java.util.Iterator<Double> number_iter_1 = numbers.iterator();
        Double number_1;
        assertTrue(number_iter_1.hasNext()); //[1]
        number_1 = number_iter_1.next();
        sum_1 += number_1;
        assertTrue(number_iter_1.hasNext()); //[2]
        number_1 = number_iter_1.next();
        sum_1 += number_1;
        assertFalse(number_iter_1.hasNext()); //[3]
        double mean_1 = sum_1 / numbers.size();
        double deviation_sum_1 = 0.;
        java.util.Iterator<Double> number_iter_2 = numbers.iterator();
        Double number_2;
        assertTrue(number_iter_2.hasNext()); //[4]
    }

    private static void assertTrue(boolean condition) {
        if (!condition) throw new AssertionError("Expected true");
    }

    private static void assertFalse(boolean condition) {
        if (condition) throw new AssertionError("Expected false");
    }
}
```