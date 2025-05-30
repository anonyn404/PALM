import java.util.*;
public class IS_BORED27 {

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
public void my_test() {IS_BORED27.is_bored("I love programming. I enjoy learning.");
}
}