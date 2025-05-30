import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
public class MAXIMUM_K34 {

    public static ArrayList<Integer> maximum_k(ArrayList<Integer> arr, int k) {
        Collections.sort(arr);
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = arr.size() - k; i <= arr.size() - 1; i++) {
            result.add(arr.get(i));
        }
        return result;
    }
public void my_test() {maximum_k(new ArrayList<>(Arrays.asList(10, 20, 30)), 2);
}
}