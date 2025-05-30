import java.util.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.xml.bind.DatatypeConverter;
public class STRING_TO_MD546 {

    public static String string_to_md5(String text) throws NoSuchAlgorithmException {
        if (text.equals(""))
            return null;
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(text.getBytes());
        byte[] digest = md.digest();
        return DatatypeConverter.printHexBinary(digest).toLowerCase();
    }
public void my_test() {STRING_TO_MD546.string_to_md5("N");
}
}