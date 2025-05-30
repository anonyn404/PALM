import java.io.*;
import java.util.*;

public class CLOSEST_INTEGER {

    public static int closest_integer(String value) throws Exception {
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
        if (value.indexOf('.') >= 0) {
            {
                profile_var += "_T14";
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
            while (value.charAt(value.length() - 1) == '0') {
                {
                    counter_ABC_12 += 1;
                    if (counter_ABC_12 > 2)
                        throw new Exception("Out of loop-bound. Invalid path.");
                }
                int counter_ABC_13 = 0;
                {
                    profile_var += "_s13";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                value = value.substring(0, value.length() - 1);
            }
        }
        int counter_ABC_10 = 0;
        {
            profile_var += "_s10";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        double num = Double.parseDouble(value);
        int counter_ABC_9 = 0;
        {
            profile_var += "_s9";
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
        if (value.length() >= 2 && value.substring(value.length() - 2).equals(".5")) {
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
            result = num > 0 ? (int) Math.ceil(num) : (int) Math.floor(num);
        } else {
            {
                profile_var += "_F8";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            {
                counter_ABC_2 += 1;
                if (counter_ABC_2 > 2)
                    throw new Exception("Out of loop-bound. Invalid path.");
            }
            int counter_ABC_5 = 0;
            {
                profile_var += "_s5";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            if (value.length() > 0) {
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
                result = (int) Math.round(num);
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
                    
closest_integer("1.0");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
closest_integer("123");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    closest_integer("3.0");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
closest_integer("3.14");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
closest_integer("123");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
closest_integer("123.40");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
closest_integer("1.1");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
closest_integer("1");
closest_integer("42");
closest_integer("-7");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
closest_integer("1.200");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
closest_integer("3.5");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
closest_integer("3.7");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
closest_integer("3.0");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
closest_integer("2.50");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
closest_integer("3.140");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    closest_integer("123.400"); 
                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    closest_integer("1.500");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
closest_integer("1.200");

                    process_coverage();
                }
                catch (Exception e) { }
                
            try {
                FileWriter writer = new FileWriter("closest_integer.txt");
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
