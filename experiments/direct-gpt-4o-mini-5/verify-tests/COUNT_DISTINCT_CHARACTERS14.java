import java.util.*;
import java.util.HashSet;
public class COUNT_DISTINCT_CHARACTERS14 {

    public static int count_distinct_characters(String string) {
        HashSet<Character> distinct = new HashSet<Character>();
        for (char c : string.toCharArray()) {
            if (!distinct.contains(Character.toLowerCase(c)))
                distinct.add(Character.toLowerCase(c));
        }
        return distinct.size();
    }
public void my_test() {COUNT_DISTINCT_CHARACTERS14.count_distinct_characters("aaa");
}
}