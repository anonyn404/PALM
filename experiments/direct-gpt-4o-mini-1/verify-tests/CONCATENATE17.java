import java.util.*;
public class CONCATENATE17 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE17.concatenate(new String[] {""});
}
}