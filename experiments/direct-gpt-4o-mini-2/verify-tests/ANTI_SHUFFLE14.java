import java.util.*;
import java.util.Arrays;
public class ANTI_SHUFFLE14 {

    public static String anti_shuffle(String s) {
        String result = "";
        for (String str : s.split(" ")) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            result += new String(chars) + " ";
        }
        return result.substring(0, result.length() - 1);
    }
public void my_test() {ANTI_SHUFFLE14.anti_shuffle("set  theory");
}
}