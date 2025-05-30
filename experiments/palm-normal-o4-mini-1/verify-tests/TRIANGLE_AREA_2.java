import java.math.BigDecimal;
import java.math.RoundingMode;
import java.io.*;
import java.util.*;

public class TRIANGLE_AREA_2 {

    public static double triangle_area_2(double a, double b, double c) throws Exception {
        {
            counter_ABC_0 += 1;
            if (counter_ABC_0 > 2)
                throw new Exception("Out of loop-bound. Invalid path.");
        }
        int counter_ABC_6 = 0;
        {
            profile_var += "_s6";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
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
            return -1;
        }
        int counter_ABC_5 = 0;
        {
            profile_var += "_s5";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        double s = (a + b + c) / 2.;
        int counter_ABC_4 = 0;
        {
            profile_var += "_s4";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        double result = Math.pow(s * (s - a) * (s - b) * (s - c), 0.5);
        int counter_ABC_3 = 0;
        {
            profile_var += "_s3";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        BigDecimal bd = BigDecimal.valueOf(result);
        int counter_ABC_2 = 0;
        {
            profile_var += "_s2";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        int counter_ABC_1 = 0;
        {
            profile_var += "_s1";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        return bd.doubleValue();
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
                    
triangle_area_2(1.0, 2.0, 4.0);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
triangle_area_2(3.0, 4.0, 5.0);

                    process_coverage();
                }
                catch (Exception e) { }
                
            try {
                FileWriter writer = new FileWriter("triangle_area_2.txt");
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
