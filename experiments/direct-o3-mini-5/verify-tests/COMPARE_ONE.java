import java.io.*;
import java.util.*;

public class COMPARE_ONE {

    public static Object compare_one(Object a, Object b) throws Exception {
        {
            counter_ABC_0 += 1;
            if (counter_ABC_0 > 2)
                throw new Exception("Out of loop-bound. Invalid path.");
        }
        int counter_ABC_31 = 0;
        {
            profile_var += "_s31";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        double temp_a = 0, temp_b = 0;
        int counter_ABC_26 = 0;
        {
            profile_var += "_s26";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        if (a instanceof String) {
            {
                profile_var += "_T30";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            {
                counter_ABC_26 += 1;
                if (counter_ABC_26 > 2)
                    throw new Exception("Out of loop-bound. Invalid path.");
            }
            int counter_ABC_29 = 0;
            {
                profile_var += "_s29";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            String temp_a_string = a.toString();
            int counter_ABC_28 = 0;
            {
                profile_var += "_s28";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            temp_a_string = temp_a_string.replace(',', '.');
            int counter_ABC_27 = 0;
            {
                profile_var += "_s27";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            temp_a = Double.parseDouble(temp_a_string);
        }
        int counter_ABC_21 = 0;
        {
            profile_var += "_s21";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        if (b instanceof String) {
            {
                profile_var += "_T25";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            {
                counter_ABC_21 += 1;
                if (counter_ABC_21 > 2)
                    throw new Exception("Out of loop-bound. Invalid path.");
            }
            int counter_ABC_24 = 0;
            {
                profile_var += "_s24";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            String temp_b_string = b.toString();
            int counter_ABC_23 = 0;
            {
                profile_var += "_s23";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            temp_b_string = temp_b_string.replace(',', '.');
            int counter_ABC_22 = 0;
            {
                profile_var += "_s22";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            temp_b = Double.parseDouble(temp_b_string);
        }
        int counter_ABC_18 = 0;
        {
            profile_var += "_s18";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        if (a instanceof Double) {
            {
                profile_var += "_T20";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            {
                counter_ABC_18 += 1;
                if (counter_ABC_18 > 2)
                    throw new Exception("Out of loop-bound. Invalid path.");
            }
            int counter_ABC_19 = 0;
            {
                profile_var += "_s19";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            temp_a = (Double) a;
        }
        int counter_ABC_15 = 0;
        {
            profile_var += "_s15";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        if (b instanceof Double) {
            {
                profile_var += "_T17";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            {
                counter_ABC_15 += 1;
                if (counter_ABC_15 > 2)
                    throw new Exception("Out of loop-bound. Invalid path.");
            }
            int counter_ABC_16 = 0;
            {
                profile_var += "_s16";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            temp_b = (Double) b;
        }
        int counter_ABC_12 = 0;
        {
            profile_var += "_s12";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        if (a instanceof Integer) {
            {
                profile_var += "_T14";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
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
            temp_a = ((Integer) a).doubleValue();
        }
        int counter_ABC_9 = 0;
        {
            profile_var += "_s9";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        if (b instanceof Integer) {
            {
                profile_var += "_T11";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
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
            temp_b = ((Integer) b).doubleValue();
        }
        int counter_ABC_6 = 0;
        {
            profile_var += "_s6";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        if (temp_a == temp_b) {
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
            return null;
        }
        int counter_ABC_1 = 0;
        {
            profile_var += "_s1";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        if (temp_a > temp_b) {
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
            return a;
        } else {
            {
                profile_var += "_F5";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            {
                counter_ABC_1 += 1;
                if (counter_ABC_1 > 2)
                    throw new Exception("Out of loop-bound. Invalid path.");
            }
            int counter_ABC_4 = 0;
            {
                profile_var += "_s4";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            return b;
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
                    COMPARE_ONE.compare_one("2", "1");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COMPARE_ONE.compare_one(1.0, 1.0);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COMPARE_ONE.compare_one("2", 1);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COMPARE_ONE.compare_one(1.0, 2.0);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COMPARE_ONE.compare_one("2,5", "1,5");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COMPARE_ONE.compare_one("1", "1");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COMPARE_ONE.compare_one("1,5", "1,5");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COMPARE_ONE.compare_one(1, "2");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COMPARE_ONE.compare_one(1, 2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COMPARE_ONE.compare_one("1,5", "2,5");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COMPARE_ONE.compare_one(1, 1);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COMPARE_ONE.compare_one("1", "2");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COMPARE_ONE.compare_one(2, 1);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COMPARE_ONE.compare_one(2.0, 1.0);

                    process_coverage();
                }
                catch (Exception e) { }
                
            try {
                FileWriter writer = new FileWriter("compare_one.txt");
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
