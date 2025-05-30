import java.util.*;
import java.util.List;
public class MAX_ELEMENT32 {

    public static int max_element(List<Integer> l) {
        int m = l.get(0);
        for (Integer e : l) {
            if (e > m) {
                m = e;
            }
        }
        return m;
    }
public void my_test() {max_element(Arrays.asList(Integer.MIN_VALUE, 0));
}
}