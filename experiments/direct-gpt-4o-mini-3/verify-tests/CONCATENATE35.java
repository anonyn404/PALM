import java.util.*;
public class CONCATENATE35 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE35.concatenate(new String[]{"single"});
}
}