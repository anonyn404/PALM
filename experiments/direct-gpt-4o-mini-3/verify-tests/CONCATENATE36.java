import java.util.*;
public class CONCATENATE36 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE36.concatenate(new String[]{"spark", "plug"});
}
}