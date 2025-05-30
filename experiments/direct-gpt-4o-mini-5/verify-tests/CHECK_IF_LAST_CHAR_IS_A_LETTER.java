import java.io.*;
import java.util.*;

public class CHECK_IF_LAST_CHAR_IS_A_LETTER {

    public static boolean check_if_last_char_is_a_letter(String txt) throws Exception {
        {
            counter_ABC_0 += 1;
            if (counter_ABC_0 > 2)
                throw new Exception("Out of loop-bound. Invalid path.");
        }
        int counter_ABC_13 = 0;
        {
            profile_var += "_s13";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        String[] parts = txt.split(" ");
        int counter_ABC_12 = 0;
        {
            profile_var += "_s12";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        String last = " ";
        int counter_ABC_9 = 0;
        {
            profile_var += "_s9";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        if (parts.length != 0) {
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
            last = parts[parts.length - 1];
        }
        int counter_ABC_6 = 0;
        {
            profile_var += "_s6";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        if (txt.length() != 0 && txt.charAt(txt.length() - 1) == ' ') {
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
            last = " ";
        }
        int counter_ABC_3 = 0;
        {
            profile_var += "_s3";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        if (txt.length() == 0) {
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
            last = " ";
        }
        int counter_ABC_2 = 0;
        {
            profile_var += "_s2";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        int last_char_pos = Character.toLowerCase(last.charAt(0)) - 'a';
        int counter_ABC_1 = 0;
        {
            profile_var += "_s1";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        return (last.length() == 1) && (0 <= last_char_pos && last_char_pos <= 25);
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
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("c d ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("bar ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Ending with a space ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Only1 ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Last character is a dot.");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("End.");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("_");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter(" !  ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Test 1");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Only1");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("x");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("A");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("A perfect day");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("End ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("abc 1");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("The quick brown fox");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Foo bar");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("This is a test ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Test @");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Middle test");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("... ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("z");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("xyz ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("This is a test");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Sample sentence.");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("1");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Hello");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("1st Place");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Test");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Z");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Test ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("A ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Yes !");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Test123");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Hello ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter(" m ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Alpha-1");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Non-letter last char!");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("12345");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("multiple words with trailing space ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Quick brown fox ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("123");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter(" ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Middle ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("b cd");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("No way");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Z ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("a");

                    process_coverage();
                }
                catch (Exception e) { }
                
            try {
                FileWriter writer = new FileWriter("check_if_last_char_is_a_letter.txt");
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
