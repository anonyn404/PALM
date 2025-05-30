import java.util.*;
public class EAT25 {

    public static int[] eat(int number, int need, int remaining) {
        if (need <= remaining) {
            return new int[] { number + need, remaining - need };
        } else {
            return new int[] { number + remaining, 0 };
        }
    }
public void my_test() {EAT25.eat(2, 0, 0);
}
}