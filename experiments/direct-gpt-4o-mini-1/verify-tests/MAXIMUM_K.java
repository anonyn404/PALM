import java.io.*;
import java.util.*;

public class MAXIMUM_K {

    public static ArrayList<Integer> maximum_k(ArrayList<Integer> arr, int k) throws Exception {
        {
            counter_ABC_0 += 1;
            if (counter_ABC_0 > 2)
                throw new Exception("Out of loop-bound. Invalid path.");
        }
        int counter_ABC_5 = 0;
        {
            profile_var += "_s5";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        Collections.sort(arr);
        int counter_ABC_4 = 0;
        {
            profile_var += "_s4";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        ArrayList<Integer> result = new ArrayList<>();
        int counter_ABC_2 = 0;
        {
            profile_var += "_s2";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        for (int i = arr.size() - k; i <= arr.size() - 1; i++) {
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
            result.add(arr.get(i));
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
                    maximum_k(new ArrayList<>(Arrays.asList(3, 3, 3, 3, 3)), 3);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(-10, 0)), 1);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(5)), 1);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6)), 0);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(9, 3, 2)), 2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(8, 7, 6, 5, 4)), 0);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(4, 8, 4, 8, 2)), 3);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(4)), 1);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(0, -1, -2)), 2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(100, 10, 35, 60)), 2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList()), 1);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(3, 1, 2)), 2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(4, 3, 2, 1)), 1);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(1000, 500, 200)), 2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(0, 0, 0)), 2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(-1, -5, -3)), 0);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(1, 2, 3)), 1);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(9, 9, 8, 7)), 3);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(7, 8, 9, 10)), 1);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(0, 1, 2)), 0);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(500, 300, 100)), 2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1)), 2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(1, 2)), 2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50)), 4);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(10, 10)), 1);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(1, 3, 2, 4)), 1);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(-5, -1, -3, -6)), 3);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(50, 40, 30, 20, 10)), 4);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(6, 8, 5, 10)), 1);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(-1, -2, -3, -4, -5)), 1);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(1, -1, 0)), 2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10)), 3);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList()), 0);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)), 1);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(5, 10, 15, 20)), 3);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(-1, -2, -3, 4)), 2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(5, 10, 5)), 2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1)), 2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(-10, -20, 0, 10, 20)), 2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList()), 2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(1, 1)), 2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(50, 20, 10, 30)), 1);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(15, 25, 5)), 1);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(100, 200, 300, 400)), 4);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    maximum_k(new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11)), 5);

                    process_coverage();
                }
                catch (Exception e) { }
                
            try {
                FileWriter writer = new FileWriter("maximum_k.txt");
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
