import java.util.*;
public class CAN_ARRANGE41 {

    public static int can_arrange(int[] arr) {
        int ind = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1])
                ind = i;
        }
        return ind;
    }
public void my_test() {can_arrange(new int[]{2, 0, 1});
}
}