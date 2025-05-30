import java.io.*;
import java.util.*;

public class PRIME_FIB {

    public static boolean is_prime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i < (int) Math.sqrt(n) + 1; i += 1) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static int prime_fib(int n) throws Exception {
        {
            counter_ABC_0 += 1;
            if (counter_ABC_0 > 2)
                throw new Exception("Out of loop-bound. Invalid path.");
        }
        int counter_ABC_12 = 0;
        {
            profile_var += "_s12";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        ArrayList<Integer> fib = new ArrayList<Integer>();
        int counter_ABC_11 = 0;
        {
            profile_var += "_s11";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        fib.add(0);
        int counter_ABC_10 = 0;
        {
            profile_var += "_s10";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        fib.add(1);
        int counter_ABC_1 = 0;
        {
            profile_var += "_s1";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        while (true) {
            {
                counter_ABC_1 += 1;
                if (counter_ABC_1 > 2)
                    throw new Exception("Out of loop-bound. Invalid path.");
            }
            int counter_ABC_9 = 0;
            {
                profile_var += "_s9";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            int len = fib.size();
            int counter_ABC_8 = 0;
            {
                profile_var += "_s8";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            fib.add(fib.get(len - 1) + fib.get(len - 2));
            int counter_ABC_5 = 0;
            {
                profile_var += "_s5";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            if (is_prime(fib.get(fib.size() - 1))) {
                {
                    profile_var += "_T7";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                {
                    counter_ABC_5 += 1;
                    if (counter_ABC_5 > 2)
                        throw new Exception("Out of loop-bound. Invalid path.");
                }
                int counter_ABC_6 = 0;
                {
                    profile_var += "_s6";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                n -= 1;
            }
            int counter_ABC_2 = 0;
            {
                profile_var += "_s2";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            if (n == 0) {
                {
                    profile_var += "_T4";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                {
                    counter_ABC_2 += 1;
                    if (counter_ABC_2 > 2)
                        throw new Exception("Out of loop-bound. Invalid path.");
                }
                int counter_ABC_3 = 0;
                {
                    profile_var += "_s3";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                return fib.get(fib.size() - 1);
            }
        }
    }

    static void process_coverage() {
        if (profile_var.length() == 0)
            return;
        path_set.add(profile_var);
        profile_var = "";
    }

    public static void main(String[] args) {

                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    prime_fib(0); prime_fib(1); 
                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
    prime_fib(1);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    prime_fib(1); 
                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
prime_fib(0);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
prime_fib(1);

                    process_coverage();
                }
                catch (Exception e) { }
                
            try {
                FileWriter writer = new FileWriter("prime_fib.txt");
                for (String path : path_set)
                    writer.write(path + "\n");
                // writer.write(path_set.size() + "\n");
                // writer.write(branch_set.size() + "\n");
                // writer.write(statement_set.size() + "\n");
                writer.close();
            }
            catch (Exception e) {
                ;
            }
        
    }

    static String profile_var = "";

    static int counter_ABC_0 = -1000000;

    static Set<String> path_set = new HashSet<>();
}
