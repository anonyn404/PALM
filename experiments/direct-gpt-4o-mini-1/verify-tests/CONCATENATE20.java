import java.util.*;
public class CONCATENATE20 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE20.concatenate(new String[] {"123", "456"});
}
}