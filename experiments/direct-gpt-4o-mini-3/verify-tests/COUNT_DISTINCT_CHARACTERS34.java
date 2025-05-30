import java.util.*;
import java.util.HashSet;
public class COUNT_DISTINCT_CHARACTERS34 {

    public static int count_distinct_characters(String string) {
        HashSet<Character> distinct = new HashSet<Character>();
        for (char c : string.toCharArray()) {
            if (!distinct.contains(Character.toLowerCase(c)))
                distinct.add(Character.toLowerCase(c));
        }
        return distinct.size();
    }
public void my_test() {COUNT_DISTINCT_CHARACTERS34.count_distinct_characters("a1b2");
}
}