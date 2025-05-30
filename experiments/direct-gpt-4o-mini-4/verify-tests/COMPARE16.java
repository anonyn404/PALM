import java.util.*;
public class COMPARE16 {

    public static int[] compare(int[] game, int[] guess) {
        int[] result = new int[game.length];
        for (int i = 0; i < game.length; i += 1) {
            result[i] = Math.abs(game[i] - guess[i]);
        }
        return result;
    }
public void my_test() {COMPARE16.compare(new int[]{10, 10}, new int[]{8, 8});
}
}