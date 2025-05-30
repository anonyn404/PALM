import java.util.*;
public class CONCATENATE40 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE40.concatenate(new String[]{"Hello", "Hello"});
}
}