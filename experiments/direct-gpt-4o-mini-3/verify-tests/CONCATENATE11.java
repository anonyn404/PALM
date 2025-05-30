import java.util.*;
public class CONCATENATE11 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE11.concatenate(new String[]{"first", "second"});
}
}