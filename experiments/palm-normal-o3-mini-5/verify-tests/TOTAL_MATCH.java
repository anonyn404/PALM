import java.io.*;
import java.util.*;

public class TOTAL_MATCH {

    public static List<String> total_match(List<String> lst1, List<String> lst2) throws Exception {
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
        int l1 = 0;
        int counter_ABC_8 = 0;
        {
            profile_var += "_s8";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        for (String st : lst1) {
            {
                counter_ABC_8 += 1;
                if (counter_ABC_8 > 2)
                    throw new Exception("Out of loop-bound. Invalid path.");
            }
            int counter_ABC_9 = 0;
            {
                profile_var += "_s9";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            l1 += st.length();
        }
        int counter_ABC_7 = 0;
        {
            profile_var += "_s7";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        int l2 = 0;
        int counter_ABC_5 = 0;
        {
            profile_var += "_s5";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        for (String st : lst2) {
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
            l2 += st.length();
        }
        int counter_ABC_2 = 0;
        {
            profile_var += "_s2";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        if (l1 <= l2) {
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
            return lst1;
        }
        int counter_ABC_1 = 0;
        {
            profile_var += "_s1";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        return lst2;
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
                    
List<String> lst1 = new ArrayList<>();
lst1.add("a");
List<String> lst2 = new ArrayList<>();
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = new java.util.ArrayList<>();
List<String> lst2 = new java.util.ArrayList<>();
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = new ArrayList<>();
lst1.add("a");
List<String> lst2 = new ArrayList<>();
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
total_match(new ArrayList<>(), Arrays.asList("a"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> list1 = new ArrayList<>();
List<String> list2 = new ArrayList<>();
total_match(list1, list2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = new ArrayList<>();
lst1.add("a");
lst1.add("b");
List<String> lst2 = new ArrayList<>();
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    List<String> lst1 = new ArrayList<>();
    lst1.add("a");
    List<String> lst2 = new ArrayList<>();
    lst2.add("b");
    total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = new ArrayList<>();
List<String> lst2 = new ArrayList<>();
lst2.add("a");
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = new ArrayList<>();
lst1.add("a");
List<String> lst2 = new ArrayList<>();
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = new ArrayList<>();
List<String> lst2 = new ArrayList<>();
lst2.add("a");
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    List<String> lst1 = new ArrayList<>();
    lst1.add("");
    List<String> lst2 = new ArrayList<>();
    total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = new ArrayList<String>();
lst1.add("a");
List<String> lst2 = new ArrayList<String>();
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = Arrays.asList("a", "b");
List<String> lst2 = Arrays.asList("x");
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
total_match(Arrays.asList("a"), Arrays.asList("b"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = new ArrayList<>(Arrays.asList("a", "b"));
List<String> lst2 = new ArrayList<>();
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    List<String> lst1 = new ArrayList<>();
    List<String> lst2 = new ArrayList<>();
    lst2.add("a");
    lst2.add("b");
    total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = new ArrayList<>();
List<String> lst2 = new ArrayList<>();
lst2.add("a");
lst2.add("b");
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = new ArrayList<>(Arrays.asList("", ""));
List<String> lst2 = new ArrayList<>();
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = new ArrayList<>();
lst1.add("a");
lst1.add("b");
List<String> lst2 = new ArrayList<>();
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = new ArrayList<>();
lst1.add("a");
List<String> lst2 = new ArrayList<>();
lst2.add("a");
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = java.util.Arrays.asList("ab");
List<String> lst2 = java.util.Arrays.asList("a");
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = java.util.Arrays.asList("a", "b");
List<String> lst2 = java.util.Collections.singletonList("c");
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = new ArrayList<>();
lst1.add("A");
List<String> lst2 = new ArrayList<>();
lst2.add("B");
lst2.add("C");
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = Arrays.asList("");
List<String> lst2 = Arrays.asList("", "");
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = new ArrayList<>();
lst1.add("a");
lst1.add("a");
List<String> lst2 = new ArrayList<>();
lst2.add("aa");
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = new ArrayList<>(Arrays.asList("ab", "cd"));
List<String> lst2 = new ArrayList<>(Arrays.asList("xyz"));
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    List<String> lst1 = new ArrayList<>();
    lst1.add("abc");
    List<String> lst2 = new ArrayList<>();
    lst2.add("a");
    lst2.add("a");
    total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = new ArrayList<>();
lst1.add("a");
lst1.add("b");
List<String> lst2 = new ArrayList<>();
lst2.add("c");
lst2.add("d");
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    List<String> lst1 = new ArrayList<>(Arrays.asList("a", "a"));
    List<String> lst2 = new ArrayList<>(Arrays.asList("b", "bb"));
    total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = new ArrayList<>();
lst1.add("abc");
lst1.add("de");
List<String> lst2 = new ArrayList<>();
lst2.add("a");
lst2.add("bc");
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
            try {
                FileWriter writer = new FileWriter("total_match.txt");
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
