import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class ALL_PREFIXES30 {

    public static List<String> all_prefixes(String string) {
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < string.length(); i += 1) {
            result.add(string.substring(0, i + 1));
        }
        return result;
    }
public void my_test() {ALL_PREFIXES30.all_prefixes("aa");
}
}