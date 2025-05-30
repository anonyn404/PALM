import java.util.*;
public class SMALLEST_CHANGE10 {

    public static int smallest_change(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length / 2; i += 1) {
            if (arr[i] != arr[arr.length - i - 1])
                result += 1;
        }
        return result;
    }
public void my_test() {smallest_change(new int[]{0, 0, 0, 1});
}
}