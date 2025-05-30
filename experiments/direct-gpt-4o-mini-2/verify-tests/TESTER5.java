import java.util.*;
import java.util.*;
import ImportTest.*;
public class TESTER5 {

    int inner_field = 0;

    public int foo(int a, int b) {
        int x = 0;
        if (a > 0) {
            x += a;
            if (b > 0)
                x += b;
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
public void my_test() {foo(0, 3);
}
}