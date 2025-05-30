import java.util.*;
public class CORRECT_BRACKETING14 {

    public static boolean correct_bracketing(String brackets) {
        int depth = 0;
        for (char b : brackets.toCharArray()) {
            if (b == '<')
                depth += 1;
            else
                depth -= 1;
            if (depth < 0)
                return false;
        }
        return depth == 0;
    }
public void my_test() {CORRECT_BRACKETING14.correct_bracketing("<><><");
}
}