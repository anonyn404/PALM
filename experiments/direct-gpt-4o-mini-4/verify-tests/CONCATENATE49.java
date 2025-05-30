import java.util.*;
public class CONCATENATE49 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE49.concatenate(new String[]{"X", "Y"});
}
}