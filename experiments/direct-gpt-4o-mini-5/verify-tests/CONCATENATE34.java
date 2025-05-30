import java.util.*;
public class CONCATENATE34 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE34.concatenate(new String[]{"A", ""});
}
}