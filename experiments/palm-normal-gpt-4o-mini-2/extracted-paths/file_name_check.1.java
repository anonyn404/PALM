import java.util.*;

class FILE_NAME_CHECK {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static String file_name_check(String file_name){
    String[] lst_1 = file_name.split("\\.");
    assertTrue(lst_1.length != 2, "Path condition is violated: assertTrue(lst_1.length != 2) //[1]");
    return "No";
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static String file_name_check(String file_name){
    String[] lst_1 = file_name.split("\\.");
    assertTrue(lst_1.length != 2); //[1]
    return "No";
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(file_name.split("\\.").length != 2)

*/
