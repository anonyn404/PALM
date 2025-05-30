import java.io.*;
import java.util.*;

public class ROLLING_MAX {

    public static List<Integer> rolling_max(List<Integer> numbers) throws Exception {
        {
            counter_ABC_0 += 1;
            if (counter_ABC_0 > 2)
                throw new Exception("Out of loop-bound. Invalid path.");
        }
        int counter_ABC_10 = 0;
        {
            profile_var += "_s10";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        List<Integer> result = new ArrayList<Integer>();
        int counter_ABC_9 = 0;
        {
            profile_var += "_s9";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        Integer running_max = null;
        int counter_ABC_2 = 0;
        {
            profile_var += "_s2";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        for (Integer n : numbers) {
            {
                counter_ABC_2 += 1;
                if (counter_ABC_2 > 2)
                    throw new Exception("Out of loop-bound. Invalid path.");
            }
            int counter_ABC_4 = 0;
            {
                profile_var += "_s4";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            if (running_max == null) {
                {
                    profile_var += "_T6";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                {
                    counter_ABC_4 += 1;
                    if (counter_ABC_4 > 2)
                        throw new Exception("Out of loop-bound. Invalid path.");
                }
                int counter_ABC_5 = 0;
                {
                    profile_var += "_s5";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                running_max = n;
            } else {
                {
                    profile_var += "_F8";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                {
                    counter_ABC_4 += 1;
                    if (counter_ABC_4 > 2)
                        throw new Exception("Out of loop-bound. Invalid path.");
                }
                int counter_ABC_7 = 0;
                {
                    profile_var += "_s7";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                running_max = Math.max(running_max, n);
            }
            int counter_ABC_3 = 0;
            {
                profile_var += "_s3";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            result.add(running_max);
        }
        int counter_ABC_1 = 0;
        {
            profile_var += "_s1";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        return result;
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
                    rolling_max(Arrays.asList(1, 2, null));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(2, 2, 2));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(null, -1));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(100, 50));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(0, 1));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(3, 3));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(4, 4));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(1, null));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(5, 2, 5));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(1, -1));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(0, 0));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(null, null, 1));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(Integer.MAX_VALUE, Integer.MIN_VALUE));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(-3, 3));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(null, 2, 1));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(-3, -8, -3));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(null, 2));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(Integer.MIN_VALUE, Integer.MAX_VALUE));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(1, 2));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(1, Integer.MAX_VALUE));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(20, 20));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(2, 5, 2));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(7, 7));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(5, 10));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(1, 0));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(5, -5));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(-8, -3, -8));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(null, 1));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(10, 10));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(50, 100));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(2, 1));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(2, null));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(3, 1));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(3, -3));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(-1, null));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(1, 3));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(3, 8, 3));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(2, 2));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(null, null));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(-1, -2));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(10, 5));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(-20, -10));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(-2, -1));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(Integer.MAX_VALUE, 1));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(-5, 5));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(-10, -20));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(-1, 1));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(8, 3, 8));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(0, -1));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    rolling_max(Arrays.asList(-1, 0));

                    process_coverage();
                }
                catch (Exception e) { }
                
            try {
                FileWriter writer = new FileWriter("rolling_max.txt");
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
