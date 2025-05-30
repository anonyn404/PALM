import java.io.*;
import java.util.*;

public class SOLVE_STRING {

    public static String solve_string(String s) throws Exception {
        {
            counter_ABC_0 += 1;
            if (counter_ABC_0 > 2)
                throw new Exception("Out of loop-bound. Invalid path.");
        }
        int counter_ABC_19 = 0;
        {
            profile_var += "_s19";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        int flg = 0;
        int counter_ABC_18 = 0;
        {
            profile_var += "_s18";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        StringBuilder sb = new StringBuilder();
        int counter_ABC_7 = 0;
        {
            profile_var += "_s7";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        for (char c : s.toCharArray()) {
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
            if (Character.isAlphabetic(c)) {
                {
                    profile_var += "_T15";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                {
                    counter_ABC_8 += 1;
                    if (counter_ABC_8 > 2)
                        throw new Exception("Out of loop-bound. Invalid path.");
                }
                int counter_ABC_10 = 0;
                {
                    profile_var += "_s10";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                if (Character.isLowerCase(c)) {
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
                    sb.append(Character.toUpperCase(c));
                } else {
                    {
                        profile_var += "_F14";
                        if (profile_var.length() > 10000)
                            throw new Exception("Profiler string too long");
                    }
                    {
                        counter_ABC_10 += 1;
                        if (counter_ABC_10 > 2)
                            throw new Exception("Out of loop-bound. Invalid path.");
                    }
                    int counter_ABC_13 = 0;
                    {
                        profile_var += "_s13";
                        if (profile_var.length() > 10000)
                            throw new Exception("Profiler string too long");
                    }
                    sb.append(Character.toLowerCase(c));
                }
                int counter_ABC_9 = 0;
                {
                    profile_var += "_s9";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                flg = 1;
            } else {
                {
                    profile_var += "_F17";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                {
                    counter_ABC_8 += 1;
                    if (counter_ABC_8 > 2)
                        throw new Exception("Out of loop-bound. Invalid path.");
                }
                int counter_ABC_16 = 0;
                {
                    profile_var += "_s16";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                sb.append(c);
            }
        }
        int counter_ABC_2 = 0;
        {
            profile_var += "_s2";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        if (flg == 0) {
            {
                profile_var += "_T6";
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
            sb = new StringBuilder();
            int counter_ABC_3 = 0;
            {
                profile_var += "_s3";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            for (int i = s.length() - 1; i >= 0; i -= 1) {
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
                sb.append(s.charAt(i));
            }
        }
        int counter_ABC_1 = 0;
        {
            profile_var += "_s1";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        return sb.toString();
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
                    SOLVE_STRING.solve_string("aBcDe");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("xyz");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("noChange");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("!@#");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("Test@123");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("  ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("s0m3Symb0ls#");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("Hello World!");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("abc");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("A single sentence.");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("Lorem ipsum!");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("A12/34");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("XYZ");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("`~!@#");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("abCdEfGh");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("!@abc");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("###");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("12345");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("1a2B3c4D");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("test3case");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("abc123");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("Valid Input Test");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("H3ll0");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("BBBBBBB");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("ABC123");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("JustSpecial!@#");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("mixedC@S");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("What about spaces?");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("a1B2c");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("Changing_Cases");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("CBA");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("-----");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("####abc");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("aaaaaaa");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("UPPERCASE");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("mixedCAS3");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("ABC");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("Mixed-Example");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("noValidChars");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("A");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("Line1\nLine2");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("Nochange123");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("123");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("!abc");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("a");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("Random Text 123!");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("!@#$%^&*()_+");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("123abc456");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    SOLVE_STRING.solve_string("lowercase");

                    process_coverage();
                }
                catch (Exception e) { }
                
            try {
                FileWriter writer = new FileWriter("solve_string.txt");
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
