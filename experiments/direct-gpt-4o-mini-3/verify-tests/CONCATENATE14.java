import java.util.*;
public class CONCATENATE14 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE14.concatenate(new String[]{"alpha", "beta", "gamma"});
}
}