import java.util.*;
public class EAT15 {

    public static int[] eat(int number, int need, int remaining) {
        if (need <= remaining) {
            return new int[] { number + need, remaining - need };
        } else {
            return new int[] { number + remaining, 0 };
        }
    }
public void my_test() {EAT15.eat(6, 1, 1);
}
}