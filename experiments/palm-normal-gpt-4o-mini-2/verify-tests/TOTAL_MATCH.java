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
                    
List<String> lst1 = Arrays.asList("a", "b");
List<String> lst2 = Arrays.asList("c", "d");
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    total_match(new ArrayList<String>(), new ArrayList<String>());

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    total_match(Arrays.asList("test"), Arrays.asList("example"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = new ArrayList<>();
List<String> lst2 = new ArrayList<>(Collections.singletonList("test"));
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    total_match(new ArrayList<>(), new ArrayList<>()); 

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    List<String> lst1 = Arrays.asList("hello", "world");
    List<String> lst2 = new ArrayList<>();
    total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = new ArrayList<>();
lst1.add("test");
List<String> lst2 = new ArrayList<>();
lst2.add("example");
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
                    
List<String> lst1 = Arrays.asList("test");
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
lst2.add("test");
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    total_match(Collections.singletonList(""), Collections.emptyList()); 

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = new ArrayList<>(Collections.singletonList("a"));
List<String> lst2 = new ArrayList<>();
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = Arrays.asList("hello", "world");
List<String> lst2 = Arrays.asList("java", "test");
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = new ArrayList<>(Arrays.asList("a"));
List<String> lst2 = new ArrayList<>(Arrays.asList("b"));
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = Arrays.asList("hello", "world");
List<String> lst2 = new ArrayList<>();
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    total_match(new ArrayList<>(), Arrays.asList("ab", "cd"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = new ArrayList<>();
List<String> lst2 = new ArrayList<>(Arrays.asList("ab", "cd"));
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = Arrays.asList("", "");
List<String> lst2 = new ArrayList<>();
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = Arrays.asList("test", "case");
List<String> lst2 = new ArrayList<>();
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    total_match(Arrays.asList("a"), Arrays.asList("aa")); 

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = Arrays.asList("abc"); 
List<String> lst2 = Arrays.asList("a"); 
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = Arrays.asList("test", "test2");
List<String> lst2 = Arrays.asList("test");
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = new ArrayList<>();
lst1.add("test");
List<String> lst2 = new ArrayList<>();
lst2.add("hello");
lst2.add("world");
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = new ArrayList<>(Collections.singletonList("a"));
List<String> lst2 = new ArrayList<>(Arrays.asList("ab", "cd"));
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = Arrays.asList("a", "b");
List<String> lst2 = Arrays.asList("ab");
total_match(lst1, lst2);

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
                    
List<String> lst1 = Arrays.asList("hello", "world");
List<String> lst2 = Arrays.asList("java", "test");
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = Arrays.asList("a", "b");
List<String> lst2 = Arrays.asList("abc", "de");
total_match(lst1, lst2);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst1 = Arrays.asList("abc", "defghij");
List<String> lst2 = Arrays.asList("kl", "mno");
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
