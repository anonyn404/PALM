import java.util.*;
public class REMOVE_VOWELS16 {

    public static String remove_vowels(String string) {
        StringBuilder sb = new StringBuilder();
        for (char c : string.toCharArray()) {
            char c_lower = Character.toLowerCase(c);
            if (c_lower == 'a' || c_lower == 'e' || c_lower == 'i' || c_lower == 'o' || c_lower == 'u')
                continue;
            sb.append(c);
        }
        return sb.toString();
    }
public void my_test() {REMOVE_VOWELS16.remove_vowels("key value pairs");
}
}