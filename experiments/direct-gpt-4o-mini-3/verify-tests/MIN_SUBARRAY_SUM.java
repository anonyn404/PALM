import java.io.*;
import java.util.*;

public class MIN_SUBARRAY_SUM {

    public static long min_subarray_sum(ArrayList<Long> nums) throws Exception {
        {
            counter_ABC_0 += 1;
            if (counter_ABC_0 > 2)
                throw new Exception("Out of loop-bound. Invalid path.");
        }
        int counter_ABC_15 = 0;
        {
            profile_var += "_s15";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        long max_sum = 0;
        int counter_ABC_14 = 0;
        {
            profile_var += "_s14";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        long s = 0;
        int counter_ABC_8 = 0;
        {
            profile_var += "_s8";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        for (long num : nums) {
            {
                counter_ABC_8 += 1;
                if (counter_ABC_8 > 2)
                    throw new Exception("Out of loop-bound. Invalid path.");
            }
            int counter_ABC_13 = 0;
            {
                profile_var += "_s13";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            s += -num;
            int counter_ABC_10 = 0;
            {
                profile_var += "_s10";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            if (s < 0) {
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
                s = 0;
            }
            int counter_ABC_9 = 0;
            {
                profile_var += "_s9";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            max_sum = Math.max(s, max_sum);
        }
        int counter_ABC_3 = 0;
        {
            profile_var += "_s3";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        if (max_sum == 0) {
            {
                profile_var += "_T7";
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
            max_sum = -nums.get(0);
            int counter_ABC_4 = 0;
            {
                profile_var += "_s4";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            for (int i = 1; i < nums.size(); i++) {
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
                max_sum = Math.max(max_sum, -nums.get(i));
            }
        }
        int counter_ABC_2 = 0;
        {
            profile_var += "_s2";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        long min_sum = -max_sum;
        int counter_ABC_1 = 0;
        {
            profile_var += "_s1";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        return min_sum;
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
                    min_subarray_sum(new ArrayList<>(Arrays.asList(11L, 22L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(0L, -5L, 5L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(-5L, 9L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(-1L, -1L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(-1L, 1L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(-12L, 12L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(-22L, -11L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(-2L, 2L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(100L, 200L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(1L, -3L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(-8L, 2L, 5L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(0L, 0L, 0L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(3L, -1L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(0L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(7L, -7L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(-50L, 50L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(-3L, 1L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(1L, -1L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(5L, 3L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(-1L, 0L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(-1L, -2L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(9L, -5L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(-3L, 2L, 1L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(10L, 5L, 2L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(-6L, -4L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(2L, -2L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(3L, -3L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(-7L, 7L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(-3L, 3L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(5L, -5L, 0L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(-3L, -7L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(8L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(5L, -2L, 8L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(-1L, -1L, -1L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(-1L, 3L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(-5L, -10L, -15L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(50L, -50L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(0L, 5L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(-200L, -100L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(1L, 2L, -3L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(6L, 2L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(1L, 2L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(12L, -12L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(0L, 1L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(1L, 1L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(4L, 6L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(-2L, -6L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(0L, 0L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(-5L, 0L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    min_subarray_sum(new ArrayList<>(Arrays.asList(-8L)));

                    process_coverage();
                }
                catch (Exception e) { }
                
            try {
                FileWriter writer = new FileWriter("min_subarray_sum.txt");
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
