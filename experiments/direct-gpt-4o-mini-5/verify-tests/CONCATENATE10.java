import java.util.*;
public class CONCATENATE10 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE10.concatenate(new String[]{"Light", "Dark"});
}
}