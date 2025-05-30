import java.util.*;
public class CONCATENATE22 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE22.concatenate(new String[]{"x", "y", "z"});
}
}