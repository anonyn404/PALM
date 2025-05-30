import java.io.*;
import java.util.*;

public class LONGEST {

    public static String longest(List<String> strings) throws Exception {
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
        int maxlen = 0;
        int counter_ABC_6 = 0;
        {
            profile_var += "_s6";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        for (String string : strings) {
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
            if (string.length() > maxlen) {
                {
                    profile_var += "_T9";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                {
                    counter_ABC_7 += 1;
                    if (counter_ABC_7 > 2)
                        throw new Exception("Out of loop-bound. Invalid path.");
                }
                int counter_ABC_8 = 0;
                {
                    profile_var += "_s8";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                maxlen = string.length();
            }
        }
        int counter_ABC_2 = 0;
        {
            profile_var += "_s2";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        for (String string : strings) {
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
            if (string.length() == maxlen) {
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
                return string;
            }
        }
        int counter_ABC_1 = 0;
        {
            profile_var += "_s1";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        return null;
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
                    longest(Arrays.asList("first", "second", "third", "fourth", "fifth"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("Java", "Python", "JavaScript"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("light", "light", "lights"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("12345", "1234567", "123456789"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList(null, null, null));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("space", "spacecraft", "spaceship"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("one", "two", "three", "four", "five"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("new", "old"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("upper", "lower", "case"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("hello", "hello", "hello"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("join", "us", "to", "test"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("one", "two", "two", "one"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("repeat", "repeat", "repeat"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("one", "two", "three", "four", "five", "six"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("long", "longer", "longest", "longest"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("apple", "banana", "cherry"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("alpha", "beta", "gamma"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("test", "testing", "tester"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("red", "blue", "green", "yellow"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("length", "lengthy", "lengthiest"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("hello", "world", "sample"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("abcd", "bcde", "cdef", "defg"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("nice", "nicer", "nicest"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("a", "aa", "aaa", "aaaa"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("singleword"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("single", "double", "triple", "quadruple"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("short", "longer", "longest"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("fast", "faster", "fastest"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("up", "down", "left", "right"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("long", "short", "", "medium"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("x", "y", "z", "xy", "xyz"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("hot", "cold", "warm", "cool"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("same", "same", "different"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("big", "bigger", "biggest"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("abc", "abcd", "abcde"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("beta", "gamma", "delta", "epsilon"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("this", "is", "a", "test"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("start", "middle", "end", "final"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("Z", "Y", "X"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("short", "tiny", "small"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("hi", "hello", "world"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("cat", "dog", "fish", "elephant"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("quick", "brown", "fox", "jumps"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList());

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("", ""));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("1", "22", "333", "4444"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("same", "same", "same", "same"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("summer", "winter", "fall", "spring"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("a", "ab", "abc"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(Arrays.asList("100", "200", "300"));

                    process_coverage();
                }
                catch (Exception e) { }
                
            try {
                FileWriter writer = new FileWriter("longest.txt");
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
