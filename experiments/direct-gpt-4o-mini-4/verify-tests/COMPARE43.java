import java.util.*;
public class COMPARE43 {

    public static int[] compare(int[] game, int[] guess) {
        int[] result = new int[game.length];
        for (int i = 0; i < game.length; i += 1) {
            result[i] = Math.abs(game[i] - guess[i]);
        }
        return result;
    }
public void my_test() {COMPARE43.compare(new int[]{5, 10}, new int[]{2, 7});
}
}