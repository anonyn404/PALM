import java.util.*;
public class COMPARE8 {

    public static int[] compare(int[] game, int[] guess) {
        int[] result = new int[game.length];
        for (int i = 0; i < game.length; i += 1) {
            result[i] = Math.abs(game[i] - guess[i]);
        }
        return result;
    }
public void my_test() {compare(new int[]{10, 20, 30}, new int[]{20, 30, 10});
}
}