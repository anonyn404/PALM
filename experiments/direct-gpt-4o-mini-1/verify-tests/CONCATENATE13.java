import java.util.*;
public class CONCATENATE13 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE13.concatenate(new String[] {"Test", " ", "Test"});
}
}