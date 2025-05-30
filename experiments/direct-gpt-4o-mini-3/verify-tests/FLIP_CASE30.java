import java.util.*;
public class FLIP_CASE30 {

    public static String flip_case(String string) {
        char[] char_list = string.toCharArray();
        for (int i = 0; i < char_list.length; i += 1) {
            char c = char_list[i];
            if (Character.isLowerCase(c)) {
                char_list[i] = Character.toUpperCase(c);
            } else {
                char_list[i] = Character.toLowerCase(c);
            }
        }
        return new String(char_list);
    }
public void my_test() {FLIP_CASE30.flip_case("a1B2c3");
}
}