import java.util.*;
import java.util.*;
public class COMMON2 {

    public static int[] common(int[] l1, int[] l2) {
        HashSet<Integer> common = new HashSet<Integer>();
        for (int i = 0; i < l1.length; i += 1) {
            for (int j = 0; j < l2.length; j += 1) {
                if (l1[i] == l2[j])
                    common.add(l1[i]);
            }
        }
        int[] result = new int[common.size()];
        int index = 0;
        for (Integer c : common) {
            result[index] = c;
            index += 1;
        }
        Arrays.sort(result);
        return result;
    }
public void my_test() {COMMON2.common(new int[]{1,2}, new int[]{3,2});
}
}