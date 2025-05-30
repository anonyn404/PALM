import java.util.*;
public class CONCATENATE7 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE7.concatenate(new String[] {"Two", "Words"});
}
}