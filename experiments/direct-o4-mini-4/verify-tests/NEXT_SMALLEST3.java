import java.util.*;
import java.util.*;
public class NEXT_SMALLEST3 {

    public static Integer next_smallest(int[] lst) {
        HashSet<Integer> numbers = new HashSet<Integer>();
        for (Integer n : lst) numbers.add(n);
        Integer[] no_duplicate = numbers.toArray(new Integer[] {});
        Arrays.sort(no_duplicate);
        if (no_duplicate.length < 2)
            return null;
        return no_duplicate[1];
    }
public void my_test() {NEXT_SMALLEST3.next_smallest(new int[]{1,1,2,2});
}
}