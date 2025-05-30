import java.util.*;
public class CONCATENATE16 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE16.concatenate(new String[]{"Test", "String"});
}
}