import java.util.*;
public class CONCATENATE23 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE23.concatenate(new String[] {"A", "B"});
}
}