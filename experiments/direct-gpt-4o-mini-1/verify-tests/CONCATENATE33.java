import java.util.*;
public class CONCATENATE33 {

    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings) result += string;
        return result;
    }
public void my_test() {CONCATENATE33.concatenate(new String[] {"Complex", " ", "Mix", " of ", "Strings"});
}
}