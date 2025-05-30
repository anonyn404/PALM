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
                    TOTAL_MATCH.total_match(Arrays.asList("apple", "orange"), Arrays.asList("banana"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("test"), Arrays.asList("test"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("testString"), Arrays.asList("a", "b", "c", "d"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("l"), Arrays.asList("ll"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("base"), Arrays.asList("case", "test"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("abc"), Arrays.asList("def", "ghi"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("without"), Arrays.asList("with", "out"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("java"), Arrays.asList("kotlin", "swift"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("aa", "bb"), Arrays.asList("cc"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("longString"), Arrays.asList("short"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("test1", "test2"), Arrays.asList("test3"));

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
                    TOTAL_MATCH.total_match(Arrays.asList("hi"), Arrays.asList("hello", "bye"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("sameLength", "test"), Arrays.asList("alsoSameLength", "test"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("x"), Arrays.asList("y", "z", "w"));

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
                    TOTAL_MATCH.total_match(Arrays.asList("xyz"), Arrays.asList("xy", "y"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList(), Arrays.asList("notEmpty"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("abc", "def"), Arrays.asList("ghi"));

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
                    TOTAL_MATCH.total_match(Arrays.asList("no"), Arrays.asList("yes", "maybe"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList(""), Arrays.asList(""));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("only"), Arrays.asList("notOnly", "more"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("short"), Arrays.asList("longerString"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("single"), Arrays.asList("multiple", "other"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("one", "two"), Arrays.asList("three", "four"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList(""), Arrays.asList("hello"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("hello", "world"), Arrays.asList());

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("verylongstring"), Arrays.asList("short"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("pair", "test"), Arrays.asList("single"));

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
                    TOTAL_MATCH.total_match(Arrays.asList("ab", "cd"), Arrays.asList("e", "f", "g"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("small"), Arrays.asList("tiny", "minuscule"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("length"), Arrays.asList("of", "string"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("short"), Arrays.asList("longshort"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("a", "b", "c"), Arrays.asList("d"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("a", "b"), Arrays.asList("a", "b", "c"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("1", "2"), Arrays.asList("3", "4"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("data"), Arrays.asList("information", "moreInfo"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("singleChar"), Arrays.asList("multiChar1", "multiChar2"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("equalLength"), Arrays.asList("equalLength"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("just"), Arrays.asList("a", "b", "c"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    TOTAL_MATCH.total_match(Arrays.asList("apple"), Arrays.asList("banana", "cherry"));

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
