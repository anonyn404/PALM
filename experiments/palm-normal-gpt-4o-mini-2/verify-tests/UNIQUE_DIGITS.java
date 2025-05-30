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
                    
ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1));
unique_digits(input);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    ArrayList<Integer> testInput = new ArrayList<Integer>(); 
    // Empty input to satisfy assertFalse(i_iter_1.hasNext());
    unique_digits(testInput); 

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1));
    unique_digits(input);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    ArrayList<Integer> testInput = new ArrayList<>(Collections.singletonList(-1));
    unique_digits(testInput);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> input = new ArrayList<>(Collections.singletonList(1));
unique_digits(input);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1, 0)); unique_digits(input);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> input = new ArrayList<Integer>(Collections.singletonList(13579)); unique_digits(input);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    ArrayList<Integer> input = new ArrayList<>(Collections.singletonList(2)); 
    unique_digits(input); 

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    ArrayList<Integer> input = new ArrayList<>(Collections.singletonList(-1)); 
    unique_digits(input); 

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    ArrayList<Integer> testInput = new ArrayList<>(Collections.singletonList(1));
    unique_digits(testInput); 

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2, 4));
    unique_digits(input);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1, 1)); 
    unique_digits(input); 

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    ArrayList<Integer> testInput = new ArrayList<>(Arrays.asList(1, 3));
    unique_digits(testInput);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> input = new ArrayList<>(Collections.singletonList(2));
unique_digits(input);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> input = new ArrayList<>(Collections.singletonList(21));
unique_digits(input);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1, 1));
    unique_digits(input);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1));
    ArrayList<Integer> result = unique_digits(input); 

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2, 4));
unique_digits(input);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2, -1));
unique_digits(input);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 3));
unique_digits(input);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0, 21));
    unique_digits(input);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> testInput = new ArrayList<>(Arrays.asList(-1, 2));
unique_digits(testInput);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1, -2));
ArrayList<Integer> result = unique_digits(input);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, -1));
unique_digits(input);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0, 1));
unique_digits(input);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2, 4));
unique_digits(input);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    ArrayList<Integer> testInput = new ArrayList<>(Arrays.asList(21));
    unique_digits(testInput); 

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2));
unique_digits(input);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 3));
    unique_digits(input);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> input = new ArrayList<>(Arrays.asList(21, 24));
unique_digits(input);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    ArrayList<Integer> input = new ArrayList<>(Arrays.asList(42, 35)); 
    unique_digits(input); 

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
