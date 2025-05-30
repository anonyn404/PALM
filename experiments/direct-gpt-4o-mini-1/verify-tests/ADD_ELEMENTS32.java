import java.util.*;
import java.util.ArrayList;
public class ADD_ELEMENTS32 {

    public static int add_elements(ArrayList<Integer> arr, int k) {
        int result = 0;
        for (int i = 0; i < k; i++) {
            if (Integer.toString(arr.get(i)).length() <= 2) {
                result += arr.get(i);
            }
        }
        return result;
    }
public void my_test() {add_elements(new ArrayList<>(Arrays.asList(123, 456, 78)), 2);
}
}