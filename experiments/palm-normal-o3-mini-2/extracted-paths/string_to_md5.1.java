import java.util.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.xml.bind.DatatypeConverter;

class STRING_TO_MD5 {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static String string_to_md5(String text) throws NoSuchAlgorithmException{
    assertFalse(text.equals(""), "Path condition is violated: assertFalse(text.equals(\"\")) //[1]");
    MessageDigest md_1 = MessageDigest.getInstance("MD5");
    md_1.update(text.getBytes());
    byte[] digest_1 = md_1.digest();
    return DatatypeConverter.printHexBinary(digest_1).toLowerCase();
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.xml.bind.DatatypeConverter;
public static String string_to_md5(String text) throws NoSuchAlgorithmException{
    assertFalse(text.equals("")); //[1]
    MessageDigest md_1 = MessageDigest.getInstance("MD5");
    md_1.update(text.getBytes());
    byte[] digest_1 = md_1.digest();
    return DatatypeConverter.printHexBinary(digest_1).toLowerCase();
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(text.equals(""))

*/
