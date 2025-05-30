import java.util.*;
public class CONCATENATE12 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE12.concatenate(new String[] {"A", "B", "C"});
}
}