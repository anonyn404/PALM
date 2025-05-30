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
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Ends with a digit 1");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Special character ! ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("this is a test");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("ordinary letter S ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("X");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("B ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Hello world!");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Some random text 2");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("    ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Whitespace before letter   A");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("X Y Z ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Goodbye");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("a single letter");

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
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("A");

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
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Ends with a letter: A ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Incorrect end char # ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Text 123 ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("   Z");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("not a letter 1 ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("only letters A B C D E F G");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("another test ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("d e f ");

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
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("abc ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("large space after letter T ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Test case 1 ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("H I J K ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("p q r   ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("A B C D E ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Last letter is not allowed * ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("what about trailing spaces   ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("multiple spaces before A");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("letters followed by numbers 9 ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("   abc");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("All together A B C D");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Check this");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Some text that ends with a letter");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Test string - ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("empty spaces");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Grey text ");

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
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("abc 123");

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
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Letter in the middle e");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Check last char with space ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("abc");

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
                    CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("No letters here# ");

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
