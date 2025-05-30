import java.util.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.xml.bind.DatatypeConverter;

class STRING_TO_MD5 {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static String string_to_md5(String text) throws NoSuchAlgorithmException{
    assertTrue(text.equals(""), "Path condition is violated: assertTrue(text.equals(\"\")) //[1]");
    return null;
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
    assertTrue(text.equals("")); //[1]
    return null;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(text.equals(""))

*/
