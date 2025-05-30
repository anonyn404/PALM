import java.util.*;
import java.util.HashMap;
public class CHECK_DICT_CASE7 {

    public static boolean check_dict_case(HashMap<Object, Object> dict) {
        if (dict.size() == 0)
            return false;
        else {
            String state = "start";
            for (Object key : dict.keySet()) {
                if (!(key instanceof String)) {
                    state = "mixed";
                    break;
                }
                String str_key = (String) key;
                if (state.equals("start")) {
                    if (str_key.toUpperCase().equals(str_key))
                        state = "upper";
                    else if (str_key.toLowerCase().equals(str_key))
                        state = "lower";
                    else {
                        state = "mixed";
                        break;
                    }
                } else if ((state.equals("upper") && !str_key.toUpperCase().equals(str_key)) || (state.equals("lower") && !str_key.toLowerCase().equals(str_key))) {
                    state = "mixed";
                    break;
                }
            }
            return (state.equals("upper")) || (state.equals("lower"));
        }
    }
public void my_test() {{
    HashMap<Object,Object> m = new HashMap<>();
    m.put("Ab", 1);
    m.put("A", 2);
    check_dict_case(m);
}
}
}