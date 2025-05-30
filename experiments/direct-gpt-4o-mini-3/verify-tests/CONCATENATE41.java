import java.util.*;
public class CONCATENATE41 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE41.concatenate(new String[]{"close"});
}
}