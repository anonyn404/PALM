import java.util.*;
public class CONCATENATE3 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE3.concatenate(new String[] {"Test"});
}
}