import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class UNIQUE1 {

    public static List<Integer> unique(List<Integer> l) {
        List<Integer> result = new ArrayList<Integer>();
        for (Integer n : l) {
            if (result.contains(n))
                continue;
            result.add(n);
        }
        Collections.sort(result);
        return result;
    }
public void my_test() {UNIQUE1.unique(Arrays.asList(-1, 0, 1));
}
}