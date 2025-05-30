import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
public class MAXIMUM_K5 {

    public static ArrayList<Integer> maximum_k(ArrayList<Integer> arr, int k) {
        Collections.sort(arr);
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = arr.size() - k; i <= arr.size() - 1; i++) {
            result.add(arr.get(i));
        }
        return result;
    }
public void my_test() {MAXIMUM_K5.maximum_k(new ArrayList<Integer>() {{ add(1); add(2); }}, 0);
}
}