import java.util.*;
public class CONCATENATE32 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE32.concatenate(new String[] {"Leading", "Space", " "});
}
}