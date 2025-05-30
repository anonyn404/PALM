import java.util.*;
public class CONCATENATE18 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE18.concatenate(new String[]{"I", "J"});
}
}