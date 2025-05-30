import java.io.*;
import java.util.*;

public class SPLIT_WORDS {

    public static String[] split_words(String txt) throws Exception {
        {
            counter_ABC_0 += 1;
            if (counter_ABC_0 > 2)
                throw new Exception("Out of loop-bound. Invalid path.");
        }
        int counter_ABC_1 = 0;
        {
            profile_var += "_s1";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        if (txt.contains(" ")) {
            {
                profile_var += "_T3";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            {
                counter_ABC_1 += 1;
                if (counter_ABC_1 > 2)
                    throw new Exception("Out of loop-bound. Invalid path.");
            }
            int counter_ABC_2 = 0;
            {
                profile_var += "_s2";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            return txt.split(" ");
        } else {
            {
                profile_var += "_F16";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            {
                counter_ABC_1 += 1;
                if (counter_ABC_1 > 2)
                    throw new Exception("Out of loop-bound. Invalid path.");
            }
            int counter_ABC_4 = 0;
            {
                profile_var += "_s4";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            if (txt.contains(",")) {
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
                return txt.split(",");
            } else {
                {
                    profile_var += "_F15";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                {
                    counter_ABC_4 += 1;
                    if (counter_ABC_4 > 2)
                        throw new Exception("Out of loop-bound. Invalid path.");
                }
                int counter_ABC_14 = 0;
                {
                    profile_var += "_s14";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                int count = 0;
                int counter_ABC_9 = 0;
                {
                    profile_var += "_s9";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                for (int i = 0; i < txt.length(); i++) {
                    {
                        counter_ABC_9 += 1;
                        if (counter_ABC_9 > 2)
                            throw new Exception("Out of loop-bound. Invalid path.");
                    }
                    int counter_ABC_13 = 0;
                    {
                        profile_var += "_s13";
                        if (profile_var.length() > 10000)
                            throw new Exception("Profiler string too long");
                    }
                    char curr = txt.charAt(i);
                    int counter_ABC_10 = 0;
                    {
                        profile_var += "_s10";
                        if (profile_var.length() > 10000)
                            throw new Exception("Profiler string too long");
                    }
                    if (Character.isLowerCase(curr) && ((curr - 'a') % 2) == 1) {
                        {
                            profile_var += "_T12";
                            if (profile_var.length() > 10000)
                                throw new Exception("Profiler string too long");
                        }
                        {
                            counter_ABC_10 += 1;
                            if (counter_ABC_10 > 2)
                                throw new Exception("Out of loop-bound. Invalid path.");
                        }
                        int counter_ABC_11 = 0;
                        {
                            profile_var += "_s11";
                            if (profile_var.length() > 10000)
                                throw new Exception("Profiler string too long");
                        }
                        count++;
                    }
                }
                int counter_ABC_8 = 0;
                {
                    profile_var += "_s8";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                String[] result = { Integer.toString(count) };
                int counter_ABC_7 = 0;
                {
                    profile_var += "_s7";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                return result;
            }
        }
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
                    SPLIT_WORDS.split_words("apple,banana");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("test1 test2");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("singleword");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("A B C");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("example");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("this,is,a,test");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words(" ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("spaces in between");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("test");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("lowercase with,comma");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("word without spaces");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("no commas");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words(",");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("a b c");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("split here now");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("hello");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("hi there");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("just a test");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("  test  ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("words,with,comma,here");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("testing,splitting");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("   "); 

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("next test");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("no,spaces,here");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("test, 1, 2");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("here, there");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("x,y,z");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("Another test");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("comma,separated,values");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("we are testing, the function");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("check this split");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("split,this");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("hello world");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("abc def ghi");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("lowercase");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("long test case;with different separators");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("one two");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("try,again");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("Uppercase");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("abcd efgh"); 

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("1 2 3");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("mixed Case");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("spliting, with mispelling");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("comma");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("a,b,c,d");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("one,two");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("12345");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("normal test");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SPLIT_WORDS.split_words("word1,word2");

                    process_coverage();
                }
                catch (Exception e) { }
                
            try {
                FileWriter writer = new FileWriter("split_words.txt");
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
