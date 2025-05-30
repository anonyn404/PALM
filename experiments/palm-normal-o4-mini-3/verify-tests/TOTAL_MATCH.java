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
                    
List<String> lst1 = new ArrayList<String>();
lst1.add("item");
List<String> lst2 = new ArrayList<String>();
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = new ArrayList<String>();
List<String> lst2 = new ArrayList<String>();
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
java.util.List<String> lst1 = new java.util.ArrayList<String>();
lst1.add("a");
java.util.List<String> lst2 = new java.util.ArrayList<String>();
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
java.util.List<String> lst1 = java.util.Collections.emptyList();
java.util.List<String> lst2 = java.util.Collections.singletonList("a");
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
java.util.List<String> lst1 = new java.util.ArrayList<String>();
java.util.List<String> lst2 = new java.util.ArrayList<String>();
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
total_match(java.util.Arrays.asList("a", "bb"), java.util.Collections.emptyList());

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    List<String> lst1 = Arrays.asList("a");
List<String> lst2 = Arrays.asList("b");
total_match(lst1, lst2);
                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
total_match(new java.util.ArrayList<String>(), java.util.Arrays.asList("a"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = Arrays.asList("foo");
List<String> lst2 = Collections.emptyList();
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = new ArrayList<String>();
List<String> lst2 = new ArrayList<String>();
lst2.add("x");
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
total_match(java.util.Arrays.asList(""), java.util.Collections.<String>emptyList());

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = Arrays.asList("a");
List<String> lst2 = new ArrayList<String>();
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = Arrays.asList("a", "bb");
List<String> lst2 = Arrays.asList("c");
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = Arrays.asList("a");
List<String> lst2 = Arrays.asList("b");
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = new ArrayList<String>();
lst1.add("a");
lst1.add("b");
List<String> lst2 = new ArrayList<String>();
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
java.util.List<String> lst1 = new java.util.ArrayList<String>();
java.util.List<String> lst2 = new java.util.ArrayList<String>();
lst2.add("foo");
lst2.add("bar");
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = new java.util.ArrayList<String>();
List<String> lst2 = new java.util.ArrayList<String>();
lst2.add("a");
lst2.add("b");
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = Arrays.asList("", "");
List<String> lst2 = new ArrayList<String>();
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
java.util.List<String> lst1 = java.util.Arrays.asList("a", "b");
java.util.List<String> lst2 = new java.util.ArrayList<String>();
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
total_match(Arrays.asList("a"), Arrays.asList("ab"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = new ArrayList<>();
lst1.add("aa");
List<String> lst2 = new ArrayList<>();
lst2.add("a");
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
total_match(Arrays.asList("a", "b"), Arrays.asList("c"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
java.util.List<String> lst1 = java.util.Arrays.asList("a");
java.util.List<String> lst2 = java.util.Arrays.asList("b", "c");
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    java.util.List<String> l1 = java.util.Arrays.asList("a");
java.util.List<String> l2 = java.util.Arrays.asList("b", "c");
total_match(l1, l2);
                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
total_match(java.util.Arrays.asList("a", "a"), java.util.Arrays.asList("aa"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = Arrays.asList("a", "b");
List<String> lst2 = Arrays.asList("c");
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
java.util.List<String> lst1 = java.util.Arrays.asList("abc");
java.util.List<String> lst2 = java.util.Arrays.asList("a", "b");
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = Arrays.asList("a", "b");
List<String> lst2 = Arrays.asList("c", "d");
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = java.util.Arrays.asList("a", "b");
List<String> lst2 = java.util.Arrays.asList("c", "d");
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = Arrays.asList("aaa", "bbb");
List<String> lst2 = Arrays.asList("c", "d");
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
