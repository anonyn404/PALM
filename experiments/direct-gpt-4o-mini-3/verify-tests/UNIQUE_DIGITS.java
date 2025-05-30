import java.io.*;
import java.util.*;

public class UNIQUE_DIGITS {

    public static ArrayList<Integer> unique_digits(ArrayList<Integer> x) throws Exception {
        {
            counter_ABC_0 += 1;
            if (counter_ABC_0 > 2)
                throw new Exception("Out of loop-bound. Invalid path.");
        }
        int counter_ABC_16 = 0;
        {
            profile_var += "_s16";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        ArrayList<Integer> res = new ArrayList<Integer>();
        int counter_ABC_3 = 0;
        {
            profile_var += "_s3";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        for (int i : x) {
            {
                counter_ABC_3 += 1;
                if (counter_ABC_3 > 2)
                    throw new Exception("Out of loop-bound. Invalid path.");
            }
            int counter_ABC_15 = 0;
            {
                profile_var += "_s15";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            int num = i;
            int counter_ABC_14 = 0;
            {
                profile_var += "_s14";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            boolean all_odd = true;
            int counter_ABC_7 = 0;
            {
                profile_var += "_s7";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            while (num > 0) {
                {
                    counter_ABC_7 += 1;
                    if (counter_ABC_7 > 2)
                        throw new Exception("Out of loop-bound. Invalid path.");
                }
                int counter_ABC_13 = 0;
                {
                    profile_var += "_s13";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                int curr_digit = num % 10;
                int counter_ABC_9 = 0;
                {
                    profile_var += "_s9";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                if ((curr_digit % 2) == 0) {
                    {
                        profile_var += "_T12";
                        if (profile_var.length() > 10000)
                            throw new Exception("Profiler string too long");
                    }
                    {
                        counter_ABC_9 += 1;
                        if (counter_ABC_9 > 2)
                            throw new Exception("Out of loop-bound. Invalid path.");
                    }
                    int counter_ABC_11 = 0;
                    {
                        profile_var += "_s11";
                        if (profile_var.length() > 10000)
                            throw new Exception("Profiler string too long");
                    }
                    all_odd = false;
                    int counter_ABC_10 = 0;
                    {
                        profile_var += "_s10";
                        if (profile_var.length() > 10000)
                            throw new Exception("Profiler string too long");
                    }
                    break;
                }
                int counter_ABC_8 = 0;
                {
                    profile_var += "_s8";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                num /= 10;
            }
            int counter_ABC_4 = 0;
            {
                profile_var += "_s4";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            if (all_odd) {
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
                res.add(i);
            }
        }
        int counter_ABC_2 = 0;
        {
            profile_var += "_s2";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        Collections.sort(res);
        int counter_ABC_1 = 0;
        {
            profile_var += "_s1";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        return res;
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
                    unique_digits(new ArrayList<>(Arrays.asList(23, 33, 43)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(22, 24, 26)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(41, 43, 45)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(77, 78, 79)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(1, 3, 5)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(1, 5, 7)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(30, 31, 33)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(2, 18, 28)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(15, 17, 19)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(101, 201, 301)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(12, 14, 16)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(5, 9, 15)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(37, 39, 41)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(23, 25, 27)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(30, 32, 34)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(1, 3, 7, 9)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(35, 10, 11)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(0, 2, 4)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(5, 7, 9)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(0, 1, 4)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(10, 12, 30)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(2, 4, 8)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(14, 16, 18)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(37, 9, 19)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(3, 7, 11)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(8, 12, 16)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(31, 33, 35)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(19, 70, 80)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(2, 6, 10)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(77, 79, 81)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(7, 9, 11)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(21, 23, 25)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(2, 4, 6)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(1, 19, 21)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(6, 66, 666)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(12, 14, 22)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(11, 13, 15)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(0, 3, 3)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(19, 21, 23)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(1, 21, 121)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(2, 22, 42)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(13, 15, 19)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(101, 111, 121)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(1, 2, 3)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    unique_digits(new ArrayList<>(Arrays.asList(99, 101, 105)));

                    process_coverage();
                }
                catch (Exception e) { }
                
            try {
                FileWriter writer = new FileWriter("unique_digits.txt");
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
