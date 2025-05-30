import java.util.*;
public class CONCATENATE2 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE2.concatenate(new String[]{"ABC", "DEF"});
}
}