import java.io.*;
import java.util.*;

public class SUM_SQUARES {

    public static int sum_squares(int[] lst) throws Exception {
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
        int result = 0;
        int counter_ABC_2 = 0;
        {
            profile_var += "_s2";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        for (int i = 0; i < lst.length; i += 1) {
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
            if (i % 3 == 0) {
                {
                    profile_var += "_T5";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                {
                    counter_ABC_3 += 1;
                    if (counter_ABC_3 > 2)
                        throw new Exception("Out of loop-bound. Invalid path.");
                }
                int counter_ABC_4 = 0;
                {
                    profile_var += "_s4";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                result += lst[i] * lst[i];
            } else {
                {
                    profile_var += "_F11";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                {
                    counter_ABC_3 += 1;
                    if (counter_ABC_3 > 2)
                        throw new Exception("Out of loop-bound. Invalid path.");
                }
                int counter_ABC_6 = 0;
                {
                    profile_var += "_s6";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                if (i % 4 == 0) {
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
                    result += lst[i] * lst[i] * lst[i];
                } else {
                    {
                        profile_var += "_F10";
                        if (profile_var.length() > 10000)
                            throw new Exception("Profiler string too long");
                    }
                    {
                        counter_ABC_6 += 1;
                        if (counter_ABC_6 > 2)
                            throw new Exception("Out of loop-bound. Invalid path.");
                    }
                    int counter_ABC_9 = 0;
                    {
                        profile_var += "_s9";
                        if (profile_var.length() > 10000)
                            throw new Exception("Profiler string too long");
                    }
                    result += lst[i];
                }
            }
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
                    SUM_SQUARES.sum_squares(new int[] {7});

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SUM_SQUARES.sum_squares(new int[] {3, 5});

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SUM_SQUARES.sum_squares(new int[] {});

                    process_coverage();
                }
                catch (Exception e) { }
                
            try {
                FileWriter writer = new FileWriter("sum_squares.txt");
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
