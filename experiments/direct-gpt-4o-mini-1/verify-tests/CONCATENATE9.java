import java.util.*;
public class CONCATENATE9 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE9.concatenate(new String[] {"Nice", " to", " Meet", " You"});
}
}