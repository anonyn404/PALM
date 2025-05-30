import java.io.*;
import java.util.*;

public class HAS_CLOSE_ELEMENTS {

    public static boolean has_close_elements(List<Double> numbers, double threshold) throws Exception {
        {
            counter_ABC_0 += 1;
            if (counter_ABC_0 > 2)
                throw new Exception("Out of loop-bound. Invalid path.");
        }
        int counter_ABC_2 = 0;
        {
            profile_var += "_s2";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        for (int i = 0; i < numbers.size(); i += 1) {
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
            for (int j = i + 1; j < numbers.size(); j += 1) {
                {
                    counter_ABC_3 += 1;
                    if (counter_ABC_3 > 2)
                        throw new Exception("Out of loop-bound. Invalid path.");
                }
                int counter_ABC_7 = 0;
                {
                    profile_var += "_s7";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                double distance = Math.abs(numbers.get(i) - numbers.get(j));
                int counter_ABC_4 = 0;
                {
                    profile_var += "_s4";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                if (distance < threshold) {
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
                    return true;
                }
            }
        }
        int counter_ABC_1 = 0;
        {
            profile_var += "_s1";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        return false;
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
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(14.0, 14.1, 14.5), 0.6);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(5.5, 5.6, 5.4), 0.8);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(10.0, 10.1, 10.2, 11.0), 0.15);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(20.1, 20.2, 21.0), 0.5);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(4.5, 4.4, 4.3), 0.3);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(1.2, 2.3), 1.2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(-1.0, -1.2, -1.3), 0.5);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(1.0, 2.0, 3.0), 1.5);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(1.0, 3.0, 6.0), 2.5);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(1.0, 2.0, 2.0, 1.5), 0.6);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(100.0, 100.1, 101.0), 0.2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(2.2, 2.5), 0.4);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(3.0, 4.0), 1.2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(7.0, 7.0, 10.0), 0.5);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(-3.0, -2.9), 0.2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(3.5, 0.5), 3.0);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(8.0, 8.1, 8.2), 0.25);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(20.5, 20.4), 0.2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(2.2, 2.1, 2.0), 0.2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Collections.emptyList(), 1.0);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(3.5), 1.0);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(10.0, 10.0), 0.001);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(-5.0, -4.9), 0.2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(-2.0, 2.0), 5.0);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(6.0, 6.5, 7.0), 0.6);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(9.0, 9.4, 9.8), 0.5);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(0.0, 0.1), 0.2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(8.0, 8.0), 0.4);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(5.0, 10.0, 5.5), 0.6);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(-4.0, -3.0, -3.1), 0.2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(0.5, 1.5, 2.5), 1.0);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(0.0, 0.0, 1.0), 0.5);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(11.0, 15.0), 4.0);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(2.0, 3.5, 5.0), 2.0);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(5.0, 5.4), 0.5);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(0.0, 1.0, 2.0), 1.0);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(3.0, 3.1), 0.5);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(-1.0, -1.5), 0.7);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(1.0, 1.5, 3.0), 0.6);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(1.1, 1.2), 0.1);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(0.0, 10.0, 0.5), 1.0);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(5.0, 5.1, 5.2), 0.3);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(1.0, 1.0, 3.0), 0.1);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(0.0, 0.2), 0.2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(7.8, 8.1), 0.7);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HAS_CLOSE_ELEMENTS.has_close_elements(Arrays.asList(12.0, 12.5, 13.0), 0.7);

                    process_coverage();
                }
                catch (Exception e) { }
                
            try {
                FileWriter writer = new FileWriter("has_close_elements.txt");
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
