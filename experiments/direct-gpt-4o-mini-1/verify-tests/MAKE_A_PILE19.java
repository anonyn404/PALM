import java.util.*;
import java.util.ArrayList;
public class MAKE_A_PILE19 {

    public static ArrayList<Integer> make_a_pile(int n) {
        ArrayList<Integer> pile = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            pile.add(n + 2 * i);
        }
        return pile;
    }
public void my_test() {make_a_pile(11);
}
}