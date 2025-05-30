import java.util.*;
public class CONCATENATE4 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE4.concatenate(new String[]{"quick", "brown", "fox"});
}
}