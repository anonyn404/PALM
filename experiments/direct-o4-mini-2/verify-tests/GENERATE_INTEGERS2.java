import java.util.*;
import java.util.ArrayList;
public class GENERATE_INTEGERS2 {

    public static ArrayList<Integer> generate_integers(int a, int b) {
        int lower = Math.max(2, Math.min(a, b));
        int upper = Math.min(8, Math.max(a, b));
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = lower; i <= upper; i += 1) {
            if (i % 2 == 0)
                result.add(i);
        }
        return result;
    }
public void my_test() {generate_integers(1, 9);
}
}