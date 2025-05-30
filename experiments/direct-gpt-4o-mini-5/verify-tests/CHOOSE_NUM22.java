import java.util.*;
public class CHOOSE_NUM22 {

    public static int choose_num(int x, int y) {
        if (x > y)
            return -1;
        if ((y % 2) == 0)
            return y;
        if (x == y)
            return -1;
        return y - 1;
    }
public void my_test() {CHOOSE_NUM22.choose_num(14, 15);
}
}