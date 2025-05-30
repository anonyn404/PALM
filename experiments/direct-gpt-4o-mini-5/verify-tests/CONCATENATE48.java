import java.util.*;
public class CONCATENATE48 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE48.concatenate(new String[]{"Up", "Down"});
}
}