import java.io.*;
import java.util.*;

public class FIX_SPACES {

    public static String fix_spaces(String text) throws Exception {
        {
            counter_ABC_0 += 1;
            if (counter_ABC_0 > 2)
                throw new Exception("Out of loop-bound. Invalid path.");
        }
        int counter_ABC_32 = 0;
        {
            profile_var += "_s32";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        String new_text = "";
        int counter_ABC_31 = 0;
        {
            profile_var += "_s31";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        int i = 0;
        int counter_ABC_30 = 0;
        {
            profile_var += "_s30";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        int start = 0;
        int counter_ABC_29 = 0;
        {
            profile_var += "_s29";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        int end = 0;
        int counter_ABC_10 = 0;
        {
            profile_var += "_s10";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        while (i < text.length()) {
            {
                counter_ABC_10 += 1;
                if (counter_ABC_10 > 2)
                    throw new Exception("Out of loop-bound. Invalid path.");
            }
            int counter_ABC_12 = 0;
            {
                profile_var += "_s12";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            if (text.charAt(i) == ' ') {
                {
                    profile_var += "_T14";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                {
                    counter_ABC_12 += 1;
                    if (counter_ABC_12 > 2)
                        throw new Exception("Out of loop-bound. Invalid path.");
                }
                int counter_ABC_13 = 0;
                {
                    profile_var += "_s13";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                end += 1;
            } else {
                {
                    profile_var += "_F28";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                {
                    counter_ABC_12 += 1;
                    if (counter_ABC_12 > 2)
                        throw new Exception("Out of loop-bound. Invalid path.");
                }
                int counter_ABC_17 = 0;
                {
                    profile_var += "_s17";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                if (end - start > 2) {
                    {
                        profile_var += "_T19";
                        if (profile_var.length() > 10000)
                            throw new Exception("Profiler string too long");
                    }
                    {
                        counter_ABC_17 += 1;
                        if (counter_ABC_17 > 2)
                            throw new Exception("Out of loop-bound. Invalid path.");
                    }
                    int counter_ABC_18 = 0;
                    {
                        profile_var += "_s18";
                        if (profile_var.length() > 10000)
                            throw new Exception("Profiler string too long");
                    }
                    new_text += "-" + text.substring(i, i + 1);
                } else {
                    {
                        profile_var += "_F27";
                        if (profile_var.length() > 10000)
                            throw new Exception("Profiler string too long");
                    }
                    {
                        counter_ABC_17 += 1;
                        if (counter_ABC_17 > 2)
                            throw new Exception("Out of loop-bound. Invalid path.");
                    }
                    int counter_ABC_20 = 0;
                    {
                        profile_var += "_s20";
                        if (profile_var.length() > 10000)
                            throw new Exception("Profiler string too long");
                    }
                    if (end - start > 0) {
                        {
                            profile_var += "_T24";
                            if (profile_var.length() > 10000)
                                throw new Exception("Profiler string too long");
                        }
                        {
                            counter_ABC_20 += 1;
                            if (counter_ABC_20 > 2)
                                throw new Exception("Out of loop-bound. Invalid path.");
                        }
                        int counter_ABC_22 = 0;
                        {
                            profile_var += "_s22";
                            if (profile_var.length() > 10000)
                                throw new Exception("Profiler string too long");
                        }
                        for (int j = start; j < end; j += 1) {
                            {
                                counter_ABC_22 += 1;
                                if (counter_ABC_22 > 2)
                                    throw new Exception("Out of loop-bound. Invalid path.");
                            }
                            int counter_ABC_23 = 0;
                            {
                                profile_var += "_s23";
                                if (profile_var.length() > 10000)
                                    throw new Exception("Profiler string too long");
                            }
                            new_text += "_";
                        }
                        int counter_ABC_21 = 0;
                        {
                            profile_var += "_s21";
                            if (profile_var.length() > 10000)
                                throw new Exception("Profiler string too long");
                        }
                        new_text += text.substring(i, i + 1);
                    } else {
                        {
                            profile_var += "_F26";
                            if (profile_var.length() > 10000)
                                throw new Exception("Profiler string too long");
                        }
                        {
                            counter_ABC_20 += 1;
                            if (counter_ABC_20 > 2)
                                throw new Exception("Out of loop-bound. Invalid path.");
                        }
                        int counter_ABC_25 = 0;
                        {
                            profile_var += "_s25";
                            if (profile_var.length() > 10000)
                                throw new Exception("Profiler string too long");
                        }
                        new_text += text.substring(i, i + 1);
                    }
                }
                int counter_ABC_16 = 0;
                {
                    profile_var += "_s16";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                start = i + 1;
                int counter_ABC_15 = 0;
                {
                    profile_var += "_s15";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                end = i + 1;
            }
            int counter_ABC_11 = 0;
            {
                profile_var += "_s11";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            i += 1;
        }
        int counter_ABC_2 = 0;
        {
            profile_var += "_s2";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        if (end - start > 2) {
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
            new_text += "-";
        } else {
            {
                profile_var += "_F9";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            {
                counter_ABC_2 += 1;
                if (counter_ABC_2 > 2)
                    throw new Exception("Out of loop-bound. Invalid path.");
            }
            int counter_ABC_5 = 0;
            {
                profile_var += "_s5";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            if (end - start > 0) {
                {
                    profile_var += "_T8";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
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
                for (int j = start; j < end; j += 1) {
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
                    new_text += "_";
                }
            }
        }
        int counter_ABC_1 = 0;
        {
            profile_var += "_s1";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        return new_text;
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
                    fix_spaces("sparse     gaps");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("   too many   spaces   here   ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("  leading spaces");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("another    example  ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("hello  world    from  java");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("test  ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("single");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("join   us  ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("x     y  z");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("   ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("hello");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("trailing spaces  ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("happy   coding");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("just   one   example");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("hello   world");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("a b c d e f g");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("this is  a test");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("    ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("x     ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("lots    of   spaces  ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("no spaces");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("   x   ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("this    string    has    too    many    spaces");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("some   text with a mix of  spaces");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("one  two three");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("testing    function   ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("x  y  z");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("simple   case");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("a b c d e   ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("hello      world   from   java");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("   a   b  c  d   ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("hello   world   from java");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("check   this    out");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("  ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("a b   c   d   e   f");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("   multiple    spaces   ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("     x");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("a   b c");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("white   spaces");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("hello  world");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("hello      world");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("   skip   spaces");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("a  b    c d");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("  test");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("  a    b   c   d   e ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("   hello   world");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("a   b c   d");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("  text with multiple   spaces");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    fix_spaces("test   test");

                    process_coverage();
                }
                catch (Exception e) { }
                
            try {
                FileWriter writer = new FileWriter("fix_spaces.txt");
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
