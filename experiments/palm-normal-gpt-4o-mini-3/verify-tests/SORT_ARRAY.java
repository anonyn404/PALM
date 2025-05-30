import java.io.*;
import java.util.*;

public class SORT_ARRAY {

    public static int[] sort_array(int[] array) throws Exception {
        {
            counter_ABC_0 += 1;
            if (counter_ABC_0 > 2)
                throw new Exception("Out of loop-bound. Invalid path.");
        }
        int counter_ABC_11 = 0;
        {
            profile_var += "_s11";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        if (array.length == 0) {
            {
                profile_var += "_T13";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            {
                counter_ABC_11 += 1;
                if (counter_ABC_11 > 2)
                    throw new Exception("Out of loop-bound. Invalid path.");
            }
            int counter_ABC_12 = 0;
            {
                profile_var += "_s12";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            return array;
        }
        int counter_ABC_10 = 0;
        {
            profile_var += "_s10";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        Arrays.sort(array);
        int counter_ABC_1 = 0;
        {
            profile_var += "_s1";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        if ((array[0] + array[array.length - 1]) % 2 == 1) {
            {
                profile_var += "_T3";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            {
                counter_ABC_1 += 1;
                if (counter_ABC_1 > 2)
                    throw new Exception("Out of loop-bound. Invalid path.");
            }
            int counter_ABC_2 = 0;
            {
                profile_var += "_s2";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            return array;
        } else {
            {
                profile_var += "_F9";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            {
                counter_ABC_1 += 1;
                if (counter_ABC_1 > 2)
                    throw new Exception("Out of loop-bound. Invalid path.");
            }
            int counter_ABC_5 = 0;
            {
                profile_var += "_s5";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            for (int i = 0; i < array.length / 2; i += 1) {
                {
                    counter_ABC_5 += 1;
                    if (counter_ABC_5 > 2)
                        throw new Exception("Out of loop-bound. Invalid path.");
                }
                int counter_ABC_8 = 0;
                {
                    profile_var += "_s8";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                int tmp = array[i];
                int counter_ABC_7 = 0;
                {
                    profile_var += "_s7";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                array[i] = array[array.length - i - 1];
                int counter_ABC_6 = 0;
                {
                    profile_var += "_s6";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                array[array.length - i - 1] = tmp;
            }
            int counter_ABC_4 = 0;
            {
                profile_var += "_s4";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            return array;
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
                    
// write you code here
sort_array(new int[]{1}); 

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    sort_array(new int[0]); 
                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    sort_array(new int[]{2, 4, 6, 8}); 

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
int[] inputArray = {2, 3, 5};
sort_array(inputArray);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
sort_array(new int[]{2, 4, 6, 8}); 

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
int[] testArray = {2}; sort_array(testArray);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
int[] input = new int[]{2, 4, 6, 8};
sort_array(input);

                    process_coverage();
                }
                catch (Exception e) { }
                
            try {
                FileWriter writer = new FileWriter("sort_array.txt");
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
