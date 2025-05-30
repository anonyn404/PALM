import java.util.*;
public class CONCATENATE46 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE46.concatenate(new String[]{"test", "1", "test", "2"});
}
}