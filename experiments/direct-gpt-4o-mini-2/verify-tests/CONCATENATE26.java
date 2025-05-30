import java.util.*;
public class CONCATENATE26 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE26.concatenate(new String[] {"Test", "1"});
}
}