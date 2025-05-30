import java.util.*;
public class CONCATENATE6 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE6.concatenate(new String[] {"Java", "Unit", "Test"});
}
}