import java.util.*;
public class COMPARE24 {

    public static int[] compare(int[] game, int[] guess) {
        int[] result = new int[game.length];
        for (int i = 0; i < game.length; i += 1) {
            result[i] = Math.abs(game[i] - guess[i]);
        }
        return result;
    }
public void my_test() {COMPARE24.compare(new int[]{1, 0}, new int[]{0, 1});
}
}