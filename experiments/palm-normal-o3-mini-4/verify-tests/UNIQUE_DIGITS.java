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
                    
ArrayList<Integer> input = new ArrayList<>();
input.add(1);
unique_digits(input);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> list = new ArrayList<>();
unique_digits(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> arr = new ArrayList<>();
arr.add(1);
unique_digits(arr);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> x = new ArrayList<>();
x.add(0);
unique_digits(x);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> list = new ArrayList<>();
list.add(13);
unique_digits(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> list = new ArrayList<>();
list.add(0);
list.add(1);
unique_digits(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> al = new ArrayList<>();
al.add(11);
unique_digits(al);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> x = new ArrayList<>();
x.add(2);
unique_digits(x);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> list = new ArrayList<>();
list.add(0);
unique_digits(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> input = new ArrayList<>();
input.add(5);
unique_digits(input);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> list = new ArrayList<>();
list.add(12);
list.add(3);
unique_digits(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> list = new ArrayList<>();
list.add(-1);
list.add(1);
unique_digits(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> list = new ArrayList<>();
list.add(3);
list.add(1);
unique_digits(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> x = new ArrayList<>();
x.add(2);
unique_digits(x);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> list = new ArrayList<>();
list.add(21);
unique_digits(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(0);
    list.add(11);
    unique_digits(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> input = new ArrayList<>();
input.add(1);
unique_digits(input);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> input = new ArrayList<>();
input.add(12);
input.add(5);
unique_digits(input);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> list = new ArrayList<>();
list.add(11);
unique_digits(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    ArrayList<Integer> list = new ArrayList<>();
    list.add(12);
    list.add(0);
    unique_digits(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    ArrayList<Integer> x = new ArrayList<>();
    x.add(5);
    x.add(1);
    unique_digits(x);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    ArrayList<Integer> x = new ArrayList<>();
    x.add(0);
    x.add(11);
    unique_digits(x);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    ArrayList<Integer> input = new ArrayList<>();
    input.add(0);
    input.add(12);
    unique_digits(input);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> list = new ArrayList<>();
list.add(0);
list.add(-1);
unique_digits(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> list = new ArrayList<>();
list.add(11);
list.add(1);
unique_digits(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> input = new ArrayList<>();
input.add(3);
input.add(0);
unique_digits(input);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> list = new ArrayList<>();
list.add(0);
list.add(3);
unique_digits(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> list = new ArrayList<>();
list.add(12);
list.add(24);
unique_digits(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> list = new ArrayList<>();
list.add(87);
unique_digits(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> testList = new ArrayList<>();
testList.add(0);
testList.add(21);
unique_digits(testList);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(3);
    arr.add(2);
    unique_digits(arr);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(0);
    list.add(11);
    unique_digits(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    ArrayList<Integer> list = new ArrayList<>();
    list.add(3);
    list.add(15);
    unique_digits(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> input = new ArrayList<>();
input.add(13);
unique_digits(input);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> list = new ArrayList<>();
list.add(41);
list.add(1);
unique_digits(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> list = new ArrayList<>();
list.add(12);
list.add(13);
unique_digits(list);

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
