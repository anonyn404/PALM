import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class INTERSPERSE16 {

    public static List<Integer> intersperse(List<Integer> numbers, int delimeter) {
        List<Integer> result = new ArrayList<Integer>();
        if (numbers.size() == 0)
            return result;
        for (int i = 0; i < numbers.size() - 1; i += 1) {
            result.add(numbers.get(i));
            result.add(delimeter);
        }
        result.add(numbers.get(numbers.size() - 1));
        return result;
    }
public void my_test() {INTERSPERSE16.intersperse(Arrays.asList(1, 2), 5);
}
}