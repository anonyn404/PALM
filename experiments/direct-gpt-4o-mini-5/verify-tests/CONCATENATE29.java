import java.util.*;
public class CONCATENATE29 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE29.concatenate(new String[]{"Alpha", "Beta"});
}
}