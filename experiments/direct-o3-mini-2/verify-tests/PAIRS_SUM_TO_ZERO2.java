import java.util.*;
import java.util.List;
public class PAIRS_SUM_TO_ZERO2 {

    public static boolean pairs_sum_to_zero(List<Integer> l) {
        for (int i = 0; i < l.size(); i += 1) {
            for (int j = i + 1; j < l.size(); j += 1) {
                if (l.get(i) + l.get(j) == 0)
                    return true;
            }
        }
        return false;
    }
public void my_test() {PAIRS_SUM_TO_ZERO2.pairs_sum_to_zero(new ArrayList<>(Arrays.asList(1, 2, -1)));
}
}