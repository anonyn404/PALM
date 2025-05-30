import java.io.*;
import java.util.*;

public class FIND_CLOSEST_ELEMENTS {

    public static double[] find_closest_elements(double[] numbers) throws Exception {
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
        double[] result = new double[2];
        int counter_ABC_15 = 0;
        {
            profile_var += "_s15";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        double distance = Double.MAX_VALUE;
        int counter_ABC_2 = 0;
        {
            profile_var += "_s2";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        for (int i = 0; i < numbers.length; i += 1) {
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
            for (int j = i + 1; j < numbers.length; j += 1) {
                {
                    counter_ABC_3 += 1;
                    if (counter_ABC_3 > 2)
                        throw new Exception("Out of loop-bound. Invalid path.");
                }
                int counter_ABC_14 = 0;
                {
                    profile_var += "_s14";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                double new_distance = Math.abs(numbers[i] - numbers[j]);
                int counter_ABC_4 = 0;
                {
                    profile_var += "_s4";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                if (new_distance < distance) {
                    {
                        profile_var += "_T13";
                        if (profile_var.length() > 10000)
                            throw new Exception("Profiler string too long");
                    }
                    {
                        counter_ABC_4 += 1;
                        if (counter_ABC_4 > 2)
                            throw new Exception("Out of loop-bound. Invalid path.");
                    }
                    int counter_ABC_12 = 0;
                    {
                        profile_var += "_s12";
                        if (profile_var.length() > 10000)
                            throw new Exception("Profiler string too long");
                    }
                    distance = new_distance;
                    int counter_ABC_5 = 0;
                    {
                        profile_var += "_s5";
                        if (profile_var.length() > 10000)
                            throw new Exception("Profiler string too long");
                    }
                    if (numbers[i] < numbers[j]) {
                        {
                            profile_var += "_T8";
                            if (profile_var.length() > 10000)
                                throw new Exception("Profiler string too long");
                        }
                        {
                            counter_ABC_5 += 1;
                            if (counter_ABC_5 > 2)
                                throw new Exception("Out of loop-bound. Invalid path.");
                        }
                        int counter_ABC_7 = 0;
                        {
                            profile_var += "_s7";
                            if (profile_var.length() > 10000)
                                throw new Exception("Profiler string too long");
                        }
                        result[0] = numbers[i];
                        int counter_ABC_6 = 0;
                        {
                            profile_var += "_s6";
                            if (profile_var.length() > 10000)
                                throw new Exception("Profiler string too long");
                        }
                        result[1] = numbers[j];
                    } else {
                        {
                            profile_var += "_F11";
                            if (profile_var.length() > 10000)
                                throw new Exception("Profiler string too long");
                        }
                        {
                            counter_ABC_5 += 1;
                            if (counter_ABC_5 > 2)
                                throw new Exception("Out of loop-bound. Invalid path.");
                        }
                        int counter_ABC_10 = 0;
                        {
                            profile_var += "_s10";
                            if (profile_var.length() > 10000)
                                throw new Exception("Profiler string too long");
                        }
                        result[0] = numbers[j];
                        int counter_ABC_9 = 0;
                        {
                            profile_var += "_s9";
                            if (profile_var.length() > 10000)
                                throw new Exception("Profiler string too long");
                        }
                        result[1] = numbers[i];
                    }
                }
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
                    
double[] numbers = new double[]{1.0, 2.0}; find_closest_elements(numbers);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    find_closest_elements(new double[0]); 

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
find_closest_elements(new double[]{1.0, 2.0});

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
find_closest_elements(new double[]{1.0});

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
double[] numbers = new double[1];
find_closest_elements(numbers);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
double[] numbers = new double[]{1.0, 2.0};
find_closest_elements(numbers);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    find_closest_elements(new double[]{1.0, 2.0}); 

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
double[] numbers = {5.0, 3.0};
find_closest_elements(numbers);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
double[] numbers = {1.0, 2.0, 3.0};
find_closest_elements(numbers);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
double[] numbers = new double[]{1.0, 2.0};
find_closest_elements(numbers);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
find_closest_elements(new double[]{2.0, 1.0});

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
find_closest_elements(new double[]{1.0, 2.0});

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
find_closest_elements(new double[]{2.0, 1.0});

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
double[] numbers = new double[]{1.0, 2.0, 1.5};
find_closest_elements(numbers);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
find_closest_elements(new double[]{1.0, 2.0, 3.0});

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
double[] numbers = {5.0, 3.0, 4.0};
find_closest_elements(numbers);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    find_closest_elements(new double[]{1.0, 2.0}); 

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
double[] numbers = {2.0, 1.0};
find_closest_elements(numbers);

                    process_coverage();
                }
                catch (Exception e) { }
                
            try {
                FileWriter writer = new FileWriter("find_closest_elements.txt");
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
