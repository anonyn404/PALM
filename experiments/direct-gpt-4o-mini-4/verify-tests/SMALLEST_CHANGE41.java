import java.util.*;
public class SMALLEST_CHANGE41 {

    public static int smallest_change(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length / 2; i += 1) {
            if (arr[i] != arr[arr.length - i - 1])
                result += 1;
        }
        return result;
    }
public void my_test() {SMALLEST_CHANGE41.smallest_change(new int[]{2, 1, 2, 2});
}
}