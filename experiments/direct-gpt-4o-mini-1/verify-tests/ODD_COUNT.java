import java.io.*;
import java.util.*;

public class ODD_COUNT {

    public static ArrayList<String> odd_count(ArrayList<String> lst) throws Exception {
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
        ArrayList<String> result = new ArrayList<>();
        int counter_ABC_2 = 0;
        {
            profile_var += "_s2";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        for (String s : lst) {
            {
                counter_ABC_2 += 1;
                if (counter_ABC_2 > 2)
                    throw new Exception("Out of loop-bound. Invalid path.");
            }
            int counter_ABC_9 = 0;
            {
                profile_var += "_s9";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            int n = 0;
            int counter_ABC_4 = 0;
            {
                profile_var += "_s4";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            for (int i = 0; i < s.length(); i++) {
                {
                    counter_ABC_4 += 1;
                    if (counter_ABC_4 > 2)
                        throw new Exception("Out of loop-bound. Invalid path.");
                }
                int counter_ABC_8 = 0;
                {
                    profile_var += "_s8";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                int digit = s.charAt(i) - '0';
                int counter_ABC_5 = 0;
                {
                    profile_var += "_s5";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                if (digit % 2 == 1) {
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
                    n++;
                }
            }
            int counter_ABC_3 = 0;
            {
                profile_var += "_s3";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            result.add("the number of odd elements " + n + "n the str" + n + "ng " + n + " of the " + n + "nput.");
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
                    odd_count(new ArrayList<>(Arrays.asList("1357", "2468")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("2468", "1357")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("6", "6")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("0", "0")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("45", "67")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("89", "10")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("222", "333")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("12345", "67890")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("4321", "8765")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("91", "24")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("888", "999")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("24680", "13579")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("56", "78")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("5", "5")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("444", "555")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("4", "4")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("666", "777")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("12", "34")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("2", "3")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("13579", "24680")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("3333", "4444")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("3", "3")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("9999", "0000")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("7", "7")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("9", "9")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("7777", "8888")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("4", "5")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("0", "1")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("123", "456")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("01", "23")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("111", "222")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("000", "999")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("1111", "2222")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("8", "8")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("135", "246")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("6", "7")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("8", "9")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("13579", "02468")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("1", "1")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("2", "2")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("54321", "09876")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("54321", "98765")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("789", "543")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("1234", "5678")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("5555", "6666")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("246", "888")));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    odd_count(new ArrayList<>(Arrays.asList("000", "111")));

                    process_coverage();
                }
                catch (Exception e) { }
                
            try {
                FileWriter writer = new FileWriter("odd_count.txt");
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
