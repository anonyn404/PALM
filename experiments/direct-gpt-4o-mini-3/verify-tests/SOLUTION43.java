import java.util.*;
import java.util.ArrayList;
public class SOLUTION43 {

    public static int solution(ArrayList<Integer> lst) {
        int result = 0;
        for (int i = 0; i < lst.size(); i++) {
            if ((i % 2) == 0 && (lst.get(i) % 2) == 1) {
                result += lst.get(i);
            }
        }
        return result;
    }
public void my_test() {SOLUTION43.solution(new ArrayList<>(Arrays.asList(-2, 0)));
}
}