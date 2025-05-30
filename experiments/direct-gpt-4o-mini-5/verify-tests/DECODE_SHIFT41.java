import java.util.*;
public class DECODE_SHIFT41 {

    public static String encode_shift(String string) {
        StringBuilder sb = new StringBuilder();
        for (char c : string.toCharArray()) {
            c = (char) ((((int) c + 5 - (int) ('a')) % 26) + (int) ('a'));
            sb.append(c);
        }
        return sb.toString();
    }

    public static String decode_shift(String string) {
        StringBuilder sb = new StringBuilder();
        for (char c : string.toCharArray()) {
            c = (char) ((((int) c + 21 - (int) ('a')) % 26) + (int) ('a'));
            sb.append(c);
        }
        return sb.toString();
    }
public void my_test() {decode_shift("r");
}
}