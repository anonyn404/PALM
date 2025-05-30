import java.util.*;
public class CONCATENATE21 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE21.concatenate(new String[] { "Hello", "World", null });
}
}