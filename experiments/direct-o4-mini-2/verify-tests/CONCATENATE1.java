import java.util.*;
public class CONCATENATE1 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {concatenate(new String[]{"", ""});
}
}