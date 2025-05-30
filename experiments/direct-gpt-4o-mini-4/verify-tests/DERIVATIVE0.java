import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class DERIVATIVE0 {

    public static List<Integer> derivative(List<Integer> xs) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 1; i < xs.size(); i += 1) result.add(i * xs.get(i));
        return result;
    }
public void my_test() {DERIVATIVE0.derivative(Arrays.asList(-3, -3));
}
}