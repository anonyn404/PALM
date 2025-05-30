import java.util.*;
public class CONCATENATE8 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE8.concatenate(new String[]{"A"});
}
}