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
                    TOTAL_MATCH.total_match(Arrays.asList("two"), Arrays.asList("one"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("one", "two", "three"), Arrays.asList("four"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("Java"), Arrays.asList("Programming", "Language"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("a"), Arrays.asList("b", "c"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("abc", "def"), Arrays.asList("xyz"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("alpha", "beta"), Arrays.asList("gamma"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("edge", "case"), Arrays.asList("an", "example"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("one", "two"), Arrays.asList("three"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("empty"), Arrays.asList(""));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("uncommon"), Arrays.asList("common", "rare"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("animal", "vegetable"), Arrays.asList("mineral"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("working"), Arrays.asList("not", "working", "at", "all"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList(), Arrays.asList());

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("abc"), Arrays.asList("def"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("test", "example"), Arrays.asList("test"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("quick", "brown"), Arrays.asList("fox"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("a", "b"), Arrays.asList("c", "d", "e"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("first"), Arrays.asList("first", "second"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("join"), Arrays.asList("me", "requests"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("one"), Arrays.asList("two", "three"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList(), Arrays.asList("only", "one"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("structure"), Arrays.asList("this", "is", "nice"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList(""), Arrays.asList("test"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("z"), Arrays.asList("a", "b", "c"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("hello"), Arrays.asList("hi"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("gold"), Arrays.asList("silver", "bronze"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("a"), Arrays.asList("1", "2"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("abc"), Arrays.asList("a", "b", "c"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("case"), Arrays.asList("simple"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("foo"), Arrays.asList("bar", "baz"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("single"), Arrays.asList("multiple", "strings"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList(), Arrays.asList("not empty"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("abcd", "ef"), Arrays.asList("ghij", "kl"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("longer"), Arrays.asList("short"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("one"), Arrays.asList());

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("small"), Arrays.asList("large", "biggest"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("test", "case"), Arrays.asList("example", "input"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("long"), Arrays.asList("short", "longer"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("long"), Arrays.asList("very", "long", "input"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("list"), Arrays.asList("of", "strings"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("abcd"), Arrays.asList("ab", "cd"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("a", "b"), Arrays.asList("c", "d"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("short", "test"), Arrays.asList("just", "another", "string"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("input"), Arrays.asList("larger", "inputs", "here"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("quick"), Arrays.asList("slow", "steady"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("one", "two", "three"), Arrays.asList("four", "five"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("single"), Arrays.asList("multiple", "elements"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("examples"), Arrays.asList("test"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("hi"), Arrays.asList("hello", "world"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("short"), Arrays.asList("longer", "string"));

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
