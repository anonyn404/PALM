import java.io.*;
import java.util.*;

public class CHECK_DICT_CASE {

    public static boolean check_dict_case(HashMap<Object, Object> dict) throws Exception {
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
        if (dict.size() == 0) {
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
            return false;
        } else {
            {
                profile_var += "_F29";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            {
                counter_ABC_1 += 1;
                if (counter_ABC_1 > 2)
                    throw new Exception("Out of loop-bound. Invalid path.");
            }
            int counter_ABC_28 = 0;
            {
                profile_var += "_s28";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            String state = "start";
            int counter_ABC_5 = 0;
            {
                profile_var += "_s5";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            for (Object key : dict.keySet()) {
                {
                    counter_ABC_5 += 1;
                    if (counter_ABC_5 > 2)
                        throw new Exception("Out of loop-bound. Invalid path.");
                }
                int counter_ABC_24 = 0;
                {
                    profile_var += "_s24";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                if (!(key instanceof String)) {
                    {
                        profile_var += "_T27";
                        if (profile_var.length() > 10000)
                            throw new Exception("Profiler string too long");
                    }
                    {
                        counter_ABC_24 += 1;
                        if (counter_ABC_24 > 2)
                            throw new Exception("Out of loop-bound. Invalid path.");
                    }
                    int counter_ABC_26 = 0;
                    {
                        profile_var += "_s26";
                        if (profile_var.length() > 10000)
                            throw new Exception("Profiler string too long");
                    }
                    state = "mixed";
                    int counter_ABC_25 = 0;
                    {
                        profile_var += "_s25";
                        if (profile_var.length() > 10000)
                            throw new Exception("Profiler string too long");
                    }
                    break;
                }
                int counter_ABC_23 = 0;
                {
                    profile_var += "_s23";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                String str_key = (String) key;
                int counter_ABC_6 = 0;
                {
                    profile_var += "_s6";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                if (state.equals("start")) {
                    {
                        profile_var += "_T17";
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
                    if (str_key.toUpperCase().equals(str_key)) {
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
                        state = "upper";
                    } else {
                        {
                            profile_var += "_F16";
                            if (profile_var.length() > 10000)
                                throw new Exception("Profiler string too long");
                        }
                        {
                            counter_ABC_7 += 1;
                            if (counter_ABC_7 > 2)
                                throw new Exception("Out of loop-bound. Invalid path.");
                        }
                        int counter_ABC_10 = 0;
                        {
                            profile_var += "_s10";
                            if (profile_var.length() > 10000)
                                throw new Exception("Profiler string too long");
                        }
                        if (str_key.toLowerCase().equals(str_key)) {
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
                            state = "lower";
                        } else {
                            {
                                profile_var += "_F15";
                                if (profile_var.length() > 10000)
                                    throw new Exception("Profiler string too long");
                            }
                            {
                                counter_ABC_10 += 1;
                                if (counter_ABC_10 > 2)
                                    throw new Exception("Out of loop-bound. Invalid path.");
                            }
                            int counter_ABC_14 = 0;
                            {
                                profile_var += "_s14";
                                if (profile_var.length() > 10000)
                                    throw new Exception("Profiler string too long");
                            }
                            state = "mixed";
                            int counter_ABC_13 = 0;
                            {
                                profile_var += "_s13";
                                if (profile_var.length() > 10000)
                                    throw new Exception("Profiler string too long");
                            }
                            break;
                        }
                    }
                } else {
                    {
                        profile_var += "_F22";
                        if (profile_var.length() > 10000)
                            throw new Exception("Profiler string too long");
                    }
                    {
                        counter_ABC_6 += 1;
                        if (counter_ABC_6 > 2)
                            throw new Exception("Out of loop-bound. Invalid path.");
                    }
                    int counter_ABC_18 = 0;
                    {
                        profile_var += "_s18";
                        if (profile_var.length() > 10000)
                            throw new Exception("Profiler string too long");
                    }
                    if ((state.equals("upper") && !str_key.toUpperCase().equals(str_key)) || (state.equals("lower") && !str_key.toLowerCase().equals(str_key))) {
                        {
                            profile_var += "_T21";
                            if (profile_var.length() > 10000)
                                throw new Exception("Profiler string too long");
                        }
                        {
                            counter_ABC_18 += 1;
                            if (counter_ABC_18 > 2)
                                throw new Exception("Out of loop-bound. Invalid path.");
                        }
                        int counter_ABC_20 = 0;
                        {
                            profile_var += "_s20";
                            if (profile_var.length() > 10000)
                                throw new Exception("Profiler string too long");
                        }
                        state = "mixed";
                        int counter_ABC_19 = 0;
                        {
                            profile_var += "_s19";
                            if (profile_var.length() > 10000)
                                throw new Exception("Profiler string too long");
                        }
                        break;
                    }
                }
            }
            int counter_ABC_4 = 0;
            {
                profile_var += "_s4";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            return (state.equals("upper")) || (state.equals("lower"));
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
                    check_dict_case(new HashMap<>());

                    process_coverage();
                }
                catch (Exception e) { }
                
            try {
                FileWriter writer = new FileWriter("check_dict_case.txt");
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
