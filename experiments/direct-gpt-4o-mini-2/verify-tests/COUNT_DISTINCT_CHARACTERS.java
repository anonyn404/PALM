import java.io.*;
import java.util.*;

public class COUNT_DISTINCT_CHARACTERS {

    public static int count_distinct_characters(String string) throws Exception {
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
        HashSet<Character> distinct = new HashSet<Character>();
        int counter_ABC_2 = 0;
        {
            profile_var += "_s2";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        for (char c : string.toCharArray()) {
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
            if (!distinct.contains(Character.toLowerCase(c))) {
                {
                    profile_var += "_T5";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                {
                    counter_ABC_3 += 1;
                    if (counter_ABC_3 > 2)
                        throw new Exception("Out of loop-bound. Invalid path.");
                }
                int counter_ABC_4 = 0;
                {
                    profile_var += "_s4";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                distinct.add(Character.toLowerCase(c));
            }
        }
        int counter_ABC_1 = 0;
        {
            profile_var += "_s1";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        return distinct.size();
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
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("123abc");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("A");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("Java");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("DUPLICATE");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("123");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("Final Test");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("input string");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("Capitals");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("Mixed CASE");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("AWESOME");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("Code!");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("aabbcc");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("   ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("Distinct");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("aBc");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("cAsEs");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("aaA");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("With Spaces");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("   LeadingSpaces");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("aA");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("abc");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("!");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("Punctuations: ,.");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("a b c");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("abcABC");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("char Character");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("Identical Ids");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("testing");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("Mixed123abc");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("Multiple spaces    ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("One Word");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("word-word");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("Unique!");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("4th Time");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("abcab");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("TEST test");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("aa");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("AaBbCc");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("More letters");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("abc123");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("EndsWithSpace ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("ab");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("Test");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("a");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("It's Testing");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("aB");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("Some Text");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("a!b@c#");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    COUNT_DISTINCT_CHARACTERS.count_distinct_characters("character");

                    process_coverage();
                }
                catch (Exception e) { }
                
            try {
                FileWriter writer = new FileWriter("count_distinct_characters.txt");
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
