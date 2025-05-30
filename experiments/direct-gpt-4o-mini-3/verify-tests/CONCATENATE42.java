import java.util.*;
public class CONCATENATE42 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE42.concatenate(new String[]{"", "empty", "string"});
}
}