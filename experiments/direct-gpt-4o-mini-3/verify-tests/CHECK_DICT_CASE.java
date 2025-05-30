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
                    HashMap<Object, Object> dict32 = new HashMap<>(); dict32.put("validKey", "value"); dict32.put("anotherValidKey", "anotherValue"); check_dict_case(dict32);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict5 = new HashMap<>(); dict5.put("KEY", 1); dict5.put("key", 2); check_dict_case(dict5);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict35 = new HashMap<>(); dict35.put("UniqueKey", 1); dict35.put("AnotherKey", 2); check_dict_case(dict35);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict8 = new HashMap<>(); dict8.put(1, 1); dict8.put(2, 2); check_dict_case(dict8);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict15 = new HashMap<>(); dict15.put("upper", "string"); dict15.put("lower", "string"); check_dict_case(dict15);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict49 = new HashMap<>(); dict49.put("A", "apple"); dict49.put("B", "banana"); check_dict_case(dict49);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict31 = new HashMap<>(); dict31.put("timestamp", new Date()); check_dict_case(dict31);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict45 = new HashMap<>(); dict45.put("key123", "value"); check_dict_case(dict45);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict21 = new HashMap<>(); dict21.put("", null); check_dict_case(dict21);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict47 = new HashMap<>(); dict47.put("1", "value"); check_dict_case(dict47);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict30 = new HashMap<>(); dict30.put("KEY1", 1); dict30.put("KEY2", null); check_dict_case(dict30);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict34 = new HashMap<>(); dict34.put("CAPSLOCK", "value"); dict34.put("capslock", "value"); check_dict_case(dict34);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict16 = new HashMap<>(); dict16.put("123", "value"); check_dict_case(dict16);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict25 = new HashMap<>(); dict25.put("key123", 1); check_dict_case(dict25);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict43 = new HashMap<>(); dict43.put("valid1", "value1"); dict43.put("valid2", "value2"); check_dict_case(dict43);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict11 = new HashMap<>(); dict11.put("key1", 1); dict11.put("key2", 2); check_dict_case(dict11);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict24 = new HashMap<>(); dict24.put("MixedCase123", 1); check_dict_case(dict24);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict13 = new HashMap<>(); dict13.put("someKey", null); check_dict_case(dict13);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict3 = new HashMap<>(); dict3.put("KEY", 1); dict3.put("ANOTHER_KEY", 2); check_dict_case(dict3);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict1 = new HashMap<>(); dict1.put("KEY", 1); check_dict_case(dict1);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict14 = new HashMap<>(); dict14.put("MIXEDCase", 1); check_dict_case(dict14);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict38 = new HashMap<>(); dict38.put("anotherOne", 1); check_dict_case(dict38);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict39 = new HashMap<>(); dict39.put("STRING", "value"); dict39.put("string", "another"); check_dict_case(dict39);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict18 = new HashMap<>(); dict18.put("KEY", "value"); dict18.put("another_key", "value"); check_dict_case(dict18);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict20 = new HashMap<>(); dict20.put("unique_key", 1); dict20.put(2, 3); check_dict_case(dict20);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict33 = new HashMap<>(); dict33.put("key", "value1"); dict33.put("key", "value2"); check_dict_case(dict33);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict42 = new HashMap<>(); dict42.put("lowerHIGHER", "value"); check_dict_case(dict42);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict28 = new HashMap<>(); dict28.put(null, "value"); check_dict_case(dict28);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict37 = new HashMap<>(); dict37.put("mixedUPPER", "value"); dict37.put("mixedlower", "value"); check_dict_case(dict37);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict26 = new HashMap<>(); dict26.put(3.14, "pi"); check_dict_case(dict26);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict7 = new HashMap<>(); dict7.put("KEY", 1); dict7.put(1, 2); check_dict_case(dict7);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict6 = new HashMap<>(); dict6.put(1, 1); dict6.put("key", 2); check_dict_case(dict6);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict23 = new HashMap<>(); dict23.put("TestKey", 1); dict23.put("TESTKEY", 2); check_dict_case(dict23);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict4 = new HashMap<>(); dict4.put("key", 1); dict4.put("ANOTHER_KEY", 2); check_dict_case(dict4);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict29 = new HashMap<>(); dict29.put("UPPERCASE", 1); dict29.put("lowercase", 2); check_dict_case(dict29);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict22 = new HashMap<>(); dict22.put("HELLO", "WORLD"); dict22.put("WORLD", "HELLO"); check_dict_case(dict22);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    check_dict_case(new HashMap<>());

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict46 = new HashMap<>(); dict46.put("SOMESTRING", "value"); dict46.put("someOtherString", "anotherValue"); check_dict_case(dict46);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict41 = new HashMap<>(); dict41.put("KEYWORD", "value"); dict41.put("anotherKeyword", 3); check_dict_case(dict41);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict44 = new HashMap<>(); dict44.put("upperlower", 1); check_dict_case(dict44);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict17 = new HashMap<>(); dict17.put("Lower", "1"); dict17.put("UPPER", "2"); check_dict_case(dict17);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict10 = new HashMap<>(); dict10.put("KEY", 1); dict10.put("NOTKEY", 2); check_dict_case(dict10);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict48 = new HashMap<>(); dict48.put("12345", "number"); dict48.put("anotherKey", "value"); check_dict_case(dict48);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict36 = new HashMap<>(); dict36.put("KEYONCE", "one"); dict36.put("KEYTWICE", "two"); check_dict_case(dict36);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict27 = new HashMap<>(); dict27.put("UPPERCASE", 1); dict27.put("UPPERCASE2", 2); check_dict_case(dict27);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict40 = new HashMap<>(); dict40.put(1, "one"); dict40.put(2, 2.0); check_dict_case(dict40);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict12 = new HashMap<>(); dict12.put("KEY1", 1); dict12.put("KEY2", 2); check_dict_case(dict12);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict9 = new HashMap<>(); dict9.put("KEY", 1); dict9.put("key", 2); dict9.put(1, 3); check_dict_case(dict9);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict19 = new HashMap<>(); dict19.put("ALLCAPS", 1); dict19.put("mixedCase", 2); check_dict_case(dict19);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    HashMap<Object, Object> dict2 = new HashMap<>(); dict2.put("key", 1); check_dict_case(dict2);

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
