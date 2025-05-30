import java.util.*;
public class COMPARE15 {

    public static int[] compare(int[] game, int[] guess) {
        int[] result = new int[game.length];
        for (int i = 0; i < game.length; i += 1) {
            result[i] = Math.abs(game[i] - guess[i]);
        }
        return result;
    }
public void my_test() {COMPARE15.compare(new int[]{0, 5}, new int[]{5, 0});
}
}