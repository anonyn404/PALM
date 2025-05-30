import java.util.*;
public class CONCATENATE28 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE28.concatenate(new String[] {"One", "More", "Test"});
}
}