import java.util.*;
public class CONCATENATE44 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE44.concatenate(new String[]{"a","1","!"});
}
}