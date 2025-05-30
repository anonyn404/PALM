import java.util.*;
public class IS_BORED17 {

    public static int is_bored(String S) {
        String[] sentences = S.split("\\.|\\?|!");
        int result = 0;
        for (String sentence : sentences) {
            sentence = sentence.trim();
            if (sentence.length() >= 2 && sentence.subSequence(0, 2).equals("I "))
                result += 1;
        }
        return result;
    }
public void my_test() {is_bored("I ? I a");
}
}