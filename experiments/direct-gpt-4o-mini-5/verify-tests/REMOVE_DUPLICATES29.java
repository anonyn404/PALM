import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class REMOVE_DUPLICATES29 {

    public static List<Integer> remove_duplicates(List<Integer> numbers) {
        List<Integer> result = new ArrayList<Integer>();
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        for (Integer n : numbers) {
            if (!count.containsKey(n))
                count.put(n, 0);
            count.put(n, count.get(n) + 1);
        }
        for (Integer n : numbers) {
            if (count.get(n) == 1)
                result.add(n);
        }
        return result;
    }
public void my_test() {REMOVE_DUPLICATES29.remove_duplicates(Arrays.asList(1, 2, 3, 1));
}
}