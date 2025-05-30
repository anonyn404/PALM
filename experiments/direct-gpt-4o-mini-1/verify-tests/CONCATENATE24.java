import java.util.*;
public class CONCATENATE24 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE24.concatenate(new String[] {"1", "2", "3"});
}
}