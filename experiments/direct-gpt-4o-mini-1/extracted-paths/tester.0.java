import java.util.*;
import java.util.*;
import ImportTest.*;

class TESTER {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    int inner_field = 0;
public int bar(int a, int b) {
    int x = this.tar(a);
    return x;
}
public int tar(int a) {
    return a;
}
public int foo(int a, int b){
    int x_1 = 0;
    assertFalse(a > 0, "Path condition is violated: assertFalse(a > 0) //[1]");
    return 0;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.*;
import ImportTest.*;
int inner_field = 0;
public int bar(int a, int b) {
    int x = this.tar(a);
    return x;
}
public int tar(int a) {
    return a;
}
public int foo(int a, int b){
    int x_1 = 0;
    assertFalse(a > 0); //[1]
    return 0;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(a > 0)

*/
