import java.io.*;
import java.util.*;

public class GET_CLOSET_VOWEL {

    public static String get_closet_vowel(String word) throws Exception {
        {
            counter_ABC_0 += 1;
            if (counter_ABC_0 > 2)
                throw new Exception("Out of loop-bound. Invalid path.");
        }
        int counter_ABC_9 = 0;
        {
            profile_var += "_s9";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        if (word.length() < 3) {
            {
                profile_var += "_T11";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            {
                counter_ABC_9 += 1;
                if (counter_ABC_9 > 2)
                    throw new Exception("Out of loop-bound. Invalid path.");
            }
            int counter_ABC_10 = 0;
            {
                profile_var += "_s10";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            return "";
        }
        int counter_ABC_8 = 0;
        {
            profile_var += "_s8";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        ArrayList<Character> vowels = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int counter_ABC_2 = 0;
        {
            profile_var += "_s2";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        for (int i = word.length() - 2; i > 0; i--) {
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
            if (vowels.contains(word.charAt(i))) {
                {
                    profile_var += "_T7";
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
                if (!vowels.contains(word.charAt(i + 1)) && !vowels.contains(word.charAt(i - 1))) {
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
                    return word.substring(i, i + 1);
                }
            }
        }
        int counter_ABC_1 = 0;
        {
            profile_var += "_s1";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        return "";
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
                    GET_CLOSET_VOWEL.get_closet_vowel("sky");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("harmony");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("odd");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("open");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("brisk");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("zeroth");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("soft");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("hi");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("cloud");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("aious");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("operation");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("!");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("umbrella");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("soul");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("quasar");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("force");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("aeio");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("a");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("way");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("tree");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("wrath");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("home");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("vibe");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("quick");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("vitamin");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("xylophone");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("b");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("element");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("cafe");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("joey");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("stream");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("flutter");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("syntax");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("civic");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("whisper");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("love");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("tide");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("pearl");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("back");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("s");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("fi");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("ka");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("fb");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("deep");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("sun");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("whale");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("internet");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("night");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("bake");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    GET_CLOSET_VOWEL.get_closet_vowel("session");

                    process_coverage();
                }
                catch (Exception e) { }
                
            try {
                FileWriter writer = new FileWriter("get_closet_vowel.txt");
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
