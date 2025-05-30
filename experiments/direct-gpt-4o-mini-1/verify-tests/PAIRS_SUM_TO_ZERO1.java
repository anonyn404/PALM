import java.util.*;
import java.util.List;
public class PAIRS_SUM_TO_ZERO1 {

    public static boolean pairs_sum_to_zero(List<Integer> l) {
        for (int i = 0; i < l.size(); i += 1) {
            for (int j = i + 1; j < l.size(); j += 1) {
                if (l.get(i) + l.get(j) == 0)
                    return true;
            }
        }
        return false;
    }
public void my_test() {pairs_sum_to_zero(Arrays.asList(-1, -1, 2));
}
}