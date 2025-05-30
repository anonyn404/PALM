import java.util.*;
public class CONCATENATE15 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE15.concatenate(new String[]{"alpha", "beta"});
}
}