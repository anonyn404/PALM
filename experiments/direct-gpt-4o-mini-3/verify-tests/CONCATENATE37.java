import java.util.*;
public class CONCATENATE37 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE37.concatenate(new String[]{"a", "b", "c"});
}
}