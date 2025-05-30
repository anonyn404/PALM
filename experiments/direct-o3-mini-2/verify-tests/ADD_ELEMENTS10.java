import java.util.*;
import java.util.ArrayList;
public class ADD_ELEMENTS10 {

    public static int add_elements(ArrayList<Integer> arr, int k) {
        int result = 0;
        for (int i = 0; i < k; i++) {
            if (Integer.toString(arr.get(i)).length() <= 2) {
                result += arr.get(i);
            }
        }
        return result;
    }
public void my_test() {ADD_ELEMENTS10.add_elements(new ArrayList<Integer>(Arrays.asList(123)), 1);
}
}