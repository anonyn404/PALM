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
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Last letter A");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Check this out");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Test1");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("  hello");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Last letter Z ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("  ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("a b c");

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
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Single letter b");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("hello!");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("!abc");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("special # char");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("b c d e");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("ABC ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("C");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Test text with numbers 12345"); 

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("hello world");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("X ");

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
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("pqr");

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
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("another example ");

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
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Reserve 1");

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
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("");

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
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("good-");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Go for it! ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Good Day ");

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
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("empty ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Expecting letters!");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("letters only here");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("9");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("?");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Maybe!");

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
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("no letter here.");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Just testing");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("AB");

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
