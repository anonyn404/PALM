import java.util.*;
public class SPLIT_WORDS32 {

    public static String[] split_words(String txt) {
        if (txt.contains(" ")) {
            return txt.split(" ");
        } else if (txt.contains(",")) {
            return txt.split(",");
        } else {
            int count = 0;
            for (int i = 0; i < txt.length(); i++) {
                char curr = txt.charAt(i);
                if (Character.isLowerCase(curr) && ((curr - 'a') % 2) == 1)
                    count++;
            }
            String[] result = { Integer.toString(count) };
            return result;
        }
    }
public void my_test() {SPLIT_WORDS32.split_words("split,this");
}
}