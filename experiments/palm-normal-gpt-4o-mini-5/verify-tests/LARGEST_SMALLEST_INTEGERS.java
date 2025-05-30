import java.io.*;
import java.util.*;

public class LARGEST_SMALLEST_INTEGERS {

    public static int[] largest_smallest_integers(int[] lst) throws Exception {
        {
            counter_ABC_0 += 1;
            if (counter_ABC_0 > 2)
                throw new Exception("Out of loop-bound. Invalid path.");
        }
        int counter_ABC_20 = 0;
        {
            profile_var += "_s20";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        boolean negative = false, positive = false;
        int counter_ABC_19 = 0;
        {
            profile_var += "_s19";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        int max_negative = Integer.MIN_VALUE, min_positive = Integer.MAX_VALUE;
        int counter_ABC_9 = 0;
        {
            profile_var += "_s9";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        for (int i = 0; i < lst.length; i++) {
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
            if (lst[i] < 0) {
                {
                    profile_var += "_T13";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                {
                    counter_ABC_10 += 1;
                    if (counter_ABC_10 > 2)
                        throw new Exception("Out of loop-bound. Invalid path.");
                }
                int counter_ABC_12 = 0;
                {
                    profile_var += "_s12";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                negative = true;
                int counter_ABC_11 = 0;
                {
                    profile_var += "_s11";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                max_negative = Math.max(max_negative, lst[i]);
            } else {
                {
                    profile_var += "_F18";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                {
                    counter_ABC_10 += 1;
                    if (counter_ABC_10 > 2)
                        throw new Exception("Out of loop-bound. Invalid path.");
                }
                int counter_ABC_14 = 0;
                {
                    profile_var += "_s14";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                if (lst[i] > 0) {
                    {
                        profile_var += "_T17";
                        if (profile_var.length() > 10000)
                            throw new Exception("Profiler string too long");
                    }
                    {
                        counter_ABC_14 += 1;
                        if (counter_ABC_14 > 2)
                            throw new Exception("Out of loop-bound. Invalid path.");
                    }
                    int counter_ABC_16 = 0;
                    {
                        profile_var += "_s16";
                        if (profile_var.length() > 10000)
                            throw new Exception("Profiler string too long");
                    }
                    positive = true;
                    int counter_ABC_15 = 0;
                    {
                        profile_var += "_s15";
                        if (profile_var.length() > 10000)
                            throw new Exception("Profiler string too long");
                    }
                    min_positive = Math.min(min_positive, lst[i]);
                }
            }
        }
        int counter_ABC_6 = 0;
        {
            profile_var += "_s6";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        if (!negative) {
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
            max_negative = 0;
        }
        int counter_ABC_3 = 0;
        {
            profile_var += "_s3";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        if (!positive) {
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
            min_positive = 0;
        }
        int counter_ABC_2 = 0;
        {
            profile_var += "_s2";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        int[] result = { max_negative, min_positive };
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
                    
largest_smallest_integers(new int[]{1});

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
largest_smallest_integers(new int[0]);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
largest_smallest_integers(new int[] {});

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
largest_smallest_integers(new int[]{-1});

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
largest_smallest_integers(new int[]{0});

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
largest_smallest_integers(new int[]{1});

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
largest_smallest_integers(new int[]{0});

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
largest_smallest_integers(new int[]{0, 1});

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
largest_smallest_integers(new int[]{0});

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
largest_smallest_integers(new int[]{0});

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
largest_smallest_integers(new int[]{0, 0});

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
int[] lst = new int[]{-1, 1};
largest_smallest_integers(lst);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
largest_smallest_integers(new int[]{-1});

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
    int[] input = new int[0]; // empty array
    largest_smallest_integers(input);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
largest_smallest_integers(new int[]{-1});

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
int[] lst = {-1, -2};
largest_smallest_integers(lst);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
largest_smallest_integers(new int[]{-1, 0});

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
int[] lst = {1, 2, 3};
largest_smallest_integers(lst);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
largest_smallest_integers(new int[]{1});

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
largest_smallest_integers(new int[]{1});

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
largest_smallest_integers(new int[]{-1, 1});

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
largest_smallest_integers(new int[]{1, -1});

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
largest_smallest_integers(new int[]{1, 2});

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
largest_smallest_integers(new int[]{1, 2});

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
largest_smallest_integers(new int[]{0, 0});

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
largest_smallest_integers(new int[]{-1, 0});

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
largest_smallest_integers(new int[]{0, -1});

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
largest_smallest_integers(new int[]{0});

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
int[] lst = new int[] { 0, -1 };
largest_smallest_integers(lst);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
largest_smallest_integers(new int[]{-1, 0});

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
largest_smallest_integers(new int[]{0, 1});

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
largest_smallest_integers(new int[]{1, 0});

                    process_coverage();
                }
                catch (Exception e) { }
                
            try {
                FileWriter writer = new FileWriter("largest_smallest_integers.txt");
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
