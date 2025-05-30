import java.util.*;
public class CONCATENATE45 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE45.concatenate(new String[] {"Java", "Test"});
}
}