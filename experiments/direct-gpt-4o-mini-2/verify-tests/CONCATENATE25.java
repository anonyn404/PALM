import java.util.*;
public class CONCATENATE25 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE25.concatenate(new String[] {"Hello", "", "World"});
}
}