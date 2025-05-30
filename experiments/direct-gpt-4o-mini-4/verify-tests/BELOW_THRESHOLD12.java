import java.util.*;
public class BELOW_THRESHOLD12 {

    public static boolean below_threshold(int[] l, int t) {
        for (int i = 0; i < l.length; i += 1) {
            if (l[i] >= t)
                return false;
        }
        return true;
    }
public void my_test() {below_threshold(new int[]{-1, -1}, -1);
}
}