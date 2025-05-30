// symbolic: foo
// focal: foo
import java.util.*;
import ImportTest.*;
public class TESTER {
    // should remove this comment
    int inner_field = 0;
    /* 
    public int foo(int a, int b) {
        TESTER o = new TESTER();
        int w = 0;
        w += o.bar(a, b);
        int u = bar(a,b);
        this.bar(a,b);
        return 1;
    }*/
    public int foo(int a, int b) {
        int x = 0;
        if (a >0 ) {
            x += a;
            if (b>0) x+=b;
        }
        return x;
    }

    public int bar(int a, int b) {
        int x = this.tar(a);
        return x;
    }

    public int tar(int a) {
        return a;
    }
}