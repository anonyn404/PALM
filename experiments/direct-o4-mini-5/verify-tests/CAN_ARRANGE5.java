import java.util.*;
public class CAN_ARRANGE5 {

    public static int can_arrange(int[] arr) {
        int ind = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1])
                ind = i;
        }
        return ind;
    }
public void my_test() {CAN_ARRANGE5.can_arrange(new int[]{1, 2, 3});
}
}