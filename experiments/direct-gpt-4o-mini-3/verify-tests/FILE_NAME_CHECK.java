import java.io.*;
import java.util.*;

public class FILE_NAME_CHECK {

    public static String file_name_check(String file_name) throws Exception {
        {
            counter_ABC_0 += 1;
            if (counter_ABC_0 > 2)
                throw new Exception("Out of loop-bound. Invalid path.");
        }
        int counter_ABC_22 = 0;
        {
            profile_var += "_s22";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        String[] lst = file_name.split("\\.");
        int counter_ABC_19 = 0;
        {
            profile_var += "_s19";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        if (lst.length != 2) {
            {
                profile_var += "_T21";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            {
                counter_ABC_19 += 1;
                if (counter_ABC_19 > 2)
                    throw new Exception("Out of loop-bound. Invalid path.");
            }
            int counter_ABC_20 = 0;
            {
                profile_var += "_s20";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            return "No";
        }
        int counter_ABC_16 = 0;
        {
            profile_var += "_s16";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        if (!(lst[1].equals("txt") || lst[1].equals("exe") || lst[1].equals("dll"))) {
            {
                profile_var += "_T18";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            {
                counter_ABC_16 += 1;
                if (counter_ABC_16 > 2)
                    throw new Exception("Out of loop-bound. Invalid path.");
            }
            int counter_ABC_17 = 0;
            {
                profile_var += "_s17";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            return "No";
        }
        int counter_ABC_13 = 0;
        {
            profile_var += "_s13";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        if (lst[0].length() == 0) {
            {
                profile_var += "_T15";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            {
                counter_ABC_13 += 1;
                if (counter_ABC_13 > 2)
                    throw new Exception("Out of loop-bound. Invalid path.");
            }
            int counter_ABC_14 = 0;
            {
                profile_var += "_s14";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            return "No";
        }
        int counter_ABC_10 = 0;
        {
            profile_var += "_s10";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        if (!(('a' <= lst[0].charAt(0) && lst[0].charAt(0) <= 'z') || ('A' <= lst[0].charAt(0) && lst[0].charAt(0) <= 'Z'))) {
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
            return "No";
        }
        int counter_ABC_9 = 0;
        {
            profile_var += "_s9";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        int digit_cnt = 0;
        int counter_ABC_5 = 0;
        {
            profile_var += "_s5";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        for (char c : file_name.toCharArray()) {
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
            if ('0' <= c && c <= '9') {
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
                digit_cnt += 1;
            }
        }
        int counter_ABC_2 = 0;
        {
            profile_var += "_s2";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        if (digit_cnt > 3) {
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
            return "No";
        }
        int counter_ABC_1 = 0;
        {
            profile_var += "_s1";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        return "Yes";
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
                    file_name_check("file.exe123");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("file1234.dll");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("f@ile.txt");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("file2.dll");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("file.txt.txt");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("file.exe");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("file.");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("file1.pdf");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("file.dll");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("file.txt2");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("file1.txt");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("file.txt1");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("properFile.dll");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("file_123.txt");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("file.txtfile");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("file.txt4");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("file1.exe");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("file.txt1test");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("file.ex");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("Zfile.txt");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("file.txt\n");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("file.abc");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("..file.txt");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("file2.xyz");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("file.txt.");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("file12.txt12");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("file1234.txt");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("xfile.dll");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("file.dll6");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check(".txt");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("123file.txt");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("123file.exe");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("file..txt");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("file3.dll");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("Afile.txt");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("file123.txt");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("ab1.txt");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("file..exe");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("file12.txt");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("file.txt123");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("file@txt");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("file2.txt3");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("file.dll567");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("file.txt7");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("file3.exe");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("special-file.txt");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("file123.dll");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("file12.exe");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    file_name_check("file.txt");

                    process_coverage();
                }
                catch (Exception e) { }
                
            try {
                FileWriter writer = new FileWriter("file_name_check.txt");
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
