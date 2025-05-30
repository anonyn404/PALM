import java.util.*;
public class EAT0 {

    public static int[] eat(int number, int need, int remaining) {
        if (need <= remaining) {
            return new int[] { number + need, remaining - need };
        } else {
            return new int[] { number + remaining, 0 };
        }
    }
public void my_test() {EAT0.eat(0, 5, 10);
}
}