import java.util.*;
import java.util.List;
public class TOTAL_MATCH22 {

    public static List<String> total_match(List<String> lst1, List<String> lst2) {
        int l1 = 0;
        for (String st : lst1) l1 += st.length();
        int l2 = 0;
        for (String st : lst2) l2 += st.length();
        if (l1 <= l2)
            return lst1;
        return lst2;
    }
public void my_test() {TOTAL_MATCH22.total_match(Arrays.asList(""), Arrays.asList("test"));
}
}