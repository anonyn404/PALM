import java.io.*;
import java.util.*;

public class EXCHANGE {

    public static String exchange(ArrayList<Integer> lst1, ArrayList<Integer> lst2) throws Exception {
        {
            counter_ABC_0 += 1;
            if (counter_ABC_0 > 2)
                throw new Exception("Out of loop-bound. Invalid path.");
        }
        int counter_ABC_13 = 0;
        {
            profile_var += "_s13";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        int odd = 0, even = 0;
        int counter_ABC_9 = 0;
        {
            profile_var += "_s9";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        for (int i : lst1) {
            {
                counter_ABC_9 += 1;
                if (counter_ABC_9 > 2)
                    throw new Exception("Out of loop-bound. Invalid path.");
            }
            int counter_ABC_10 = 0;
            {
                profile_var += "_s10";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            if ((i % 2) == 1) {
                {
                    profile_var += "_T12";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                {
                    counter_ABC_10 += 1;
                    if (counter_ABC_10 > 2)
                        throw new Exception("Out of loop-bound. Invalid path.");
                }
                int counter_ABC_11 = 0;
                {
                    profile_var += "_s11";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                odd++;
            }
        }
        int counter_ABC_5 = 0;
        {
            profile_var += "_s5";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        for (int i : lst2) {
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
            if ((i % 2) == 0) {
                {
                    profile_var += "_T8";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                {
                    counter_ABC_6 += 1;
                    if (counter_ABC_6 > 2)
                        throw new Exception("Out of loop-bound. Invalid path.");
                }
                int counter_ABC_7 = 0;
                {
                    profile_var += "_s7";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                even++;
            }
        }
        int counter_ABC_2 = 0;
        {
            profile_var += "_s2";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        if (even >= odd) {
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
            return "YES";
        }
        int counter_ABC_1 = 0;
        {
            profile_var += "_s1";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        return "NO";
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
                    exchange(new ArrayList<>(Arrays.asList(1, 1)), new ArrayList<>(Arrays.asList(9, 2)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(2, 4)), new ArrayList<>(Arrays.asList(3, 7)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(2, 4)), new ArrayList<>(Arrays.asList(1, 5)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(0, 2)), new ArrayList<>(Arrays.asList(1, 3)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(1, 1)), new ArrayList<>(Arrays.asList(8, 2)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(0, 0)), new ArrayList<>(Arrays.asList(5, 5)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(9, 2)), new ArrayList<>(Arrays.asList(0, 4)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(9, 0)), new ArrayList<>(Arrays.asList(1, 1)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(4, 4)), new ArrayList<>(Arrays.asList(5, 1)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(6, 8)), new ArrayList<>(Arrays.asList(1, 9)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(3, 3)), new ArrayList<>(Arrays.asList(8, 2)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(5, 5)), new ArrayList<>(Arrays.asList(4, 4)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(3, 2)), new ArrayList<>(Arrays.asList(4, 4)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(1, 3)), new ArrayList<>(Arrays.asList(8, 10)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(5, 3)), new ArrayList<>(Arrays.asList(10, 6)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(9, 5)), new ArrayList<>(Arrays.asList(0, 0)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(2, 2)), new ArrayList<>(Arrays.asList(1, 1)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(3, 3)), new ArrayList<>(Arrays.asList(4, 4)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(3, 5)), new ArrayList<>(Arrays.asList(7, 1)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(2, 6)), new ArrayList<>(Arrays.asList(3, 5)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(2, 3)), new ArrayList<>(Arrays.asList(2, 6)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(1, 0)), new ArrayList<>(Arrays.asList(2, 4)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(3, 1)), new ArrayList<>(Arrays.asList(0, 4)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(8, 8)), new ArrayList<>(Arrays.asList(1, 2)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(2, 3)), new ArrayList<>(Arrays.asList(5, 5)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(4, 7)), new ArrayList<>(Arrays.asList(1, 3)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(6, 4)), new ArrayList<>(Arrays.asList(3, 5)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(6, 8)), new ArrayList<>(Arrays.asList(3, 1)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(5, 1)), new ArrayList<>(Arrays.asList(0, 6)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(7, 5)), new ArrayList<>(Arrays.asList(0, 2)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(8, 6)), new ArrayList<>(Arrays.asList(3, 3)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(0, 7)), new ArrayList<>(Arrays.asList(2, 8)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(0, 0)), new ArrayList<>(Arrays.asList(2, 2)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(0, 1)), new ArrayList<>(Arrays.asList(8, 6)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(1, 2)), new ArrayList<>(Arrays.asList(3, 5)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(3, 7)), new ArrayList<>(Arrays.asList(2, 2)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(1, 3)), new ArrayList<>(Arrays.asList(2, 4)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(1, 1)), new ArrayList<>(Arrays.asList(2, 2)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(4, 4)), new ArrayList<>(Arrays.asList(9, 3)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(1, 4)), new ArrayList<>(Arrays.asList(2, 5)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(10, 8)), new ArrayList<>(Arrays.asList(4, 2)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(7, 7)), new ArrayList<>(Arrays.asList(4, 0)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    exchange(new ArrayList<>(Arrays.asList(5, 7)), new ArrayList<>(Arrays.asList(1, 3)));

                    process_coverage();
                }
                catch (Exception e) { }
                
            try {
                FileWriter writer = new FileWriter("exchange.txt");
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
