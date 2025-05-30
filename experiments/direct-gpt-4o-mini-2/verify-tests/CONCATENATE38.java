import java.util.*;
public class CONCATENATE38 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE38.concatenate(new String[] {"Hello", " ", "World"});
}
}