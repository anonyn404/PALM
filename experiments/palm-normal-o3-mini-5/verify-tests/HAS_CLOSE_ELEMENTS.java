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
                    
List<Double> list = new ArrayList<>();
list.add(1.0);
has_close_elements(list, 0.5);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Double> numbers = new ArrayList<>();
has_close_elements(numbers, 0.0);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Double> list = new ArrayList<>(Arrays.asList(1.0, 2.0));
has_close_elements(list, 0.5);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
has_close_elements(Arrays.asList(0.0), 0);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Double> list = new ArrayList<>();
list.add(1.0);
has_close_elements(list, 0.1);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Double> numbers = java.util.Arrays.asList(1.0, 3.0);
has_close_elements(numbers, 2.0);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Double> numbers = new ArrayList<>();
numbers.add(1.0);
numbers.add(1.05);
double threshold = 0.1;
has_close_elements(numbers, threshold);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Double> numbers = Arrays.asList(0.0, 1.0, 2.0);
has_close_elements(numbers, 1.0);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Double> numbers = new ArrayList<>();
numbers.add(0.0);
numbers.add(1.0);
has_close_elements(numbers, 1.0);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
has_close_elements(Arrays.asList(0.0, 1.0), 1.0);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Double> numbers = Arrays.asList(0.0, 1.0, 0.5);
has_close_elements(numbers, 1.0);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Double> numbers = new ArrayList<>(Arrays.asList(0.0, 1.0, 2.0));
double threshold = 1.0;
has_close_elements(numbers, threshold);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Double> numbers = new ArrayList<>();
numbers.add(0.0);
numbers.add(10.0);
double threshold = 5.0;
has_close_elements(numbers, threshold);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Double> numbers = new ArrayList<>();
numbers.add(10.0);
numbers.add(20.0);
numbers.add(30.0);
has_close_elements(numbers, 10.0);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Double> numbers = Arrays.asList(0.0, 1.0, 2.0);
double threshold = 1.0;
has_close_elements(numbers, threshold);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    List<Double> list = new AbstractList<Double>() {
        int sizeCallCount = 0;
        public Double get(int index) {
            if(index == 0) return 0.0;
            if(index == 1) return 5.0;
            if(index == 2) return 10.0;
            throw new IndexOutOfBoundsException();
        }
        public int size() {
            sizeCallCount++;
            if(sizeCallCount < 6) return 3;
            else return 2;
        }
    };
    double threshold = 2.0;
    has_close_elements(list, threshold);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0);
has_close_elements(numbers, 1.0);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Double> numbers = Arrays.asList(0.0, 10.0, 11.0);
has_close_elements(numbers, 2.0);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    java.util.List<Double> realList = java.util.Arrays.asList(0.0, 1.0, 2.0, 3.0);
    java.util.List<Double> numbers = new java.util.AbstractList<Double>() {
        int sizeCallCount = 0;
        @Override
        public Double get(int index) {
            return realList.get(index);
        }
        @Override
        public int size() {
            int ret = (sizeCallCount < 4) ? 3 : 4;
            sizeCallCount++;
            return ret;
        }
    };
    has_close_elements(numbers, 0.5);

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
