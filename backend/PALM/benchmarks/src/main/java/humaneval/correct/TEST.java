package humaneval.correct;

public class TEST {
    public static int test(int n, int x, int y) {
        
        for (int i = 2; i < n; i += 1) {
            if (n % i == 0) return y;
        }
        return x;
    }
}
