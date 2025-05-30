import java.io.*;
import java.util.*;

public class FILTER_BY_PREFIX {

    public static List<String> filter_by_prefix(List<String> strings, String prefix) throws Exception {
        {
            counter_ABC_0 += 1;
            if (counter_ABC_0 > 2)
                throw new Exception("Out of loop-bound. Invalid path.");
        }
        int counter_ABC_6 = 0;
        {
            profile_var += "_s6";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        List<String> result = new ArrayList<String>();
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
            if (string.startsWith(prefix)) {
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
                result.add(string);
            }
        }
        int counter_ABC_1 = 0;
        {
            profile_var += "_s1";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        return result;
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
                    filter_by_prefix(new ArrayList<>(Arrays.asList("citrus", "lemon", "lime")), "ci");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("blackberry", "blueberry", "raspberry")), "bl");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("kiwi", "orange", "grapefruit")), "ki");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("lettuce", "spinach", "cabbage")), "la");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("potato", "tomato", "onion")), "to");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("coconut", "pineapple", "kiwi")), "pi");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("chocolate", "vanilla", "strawberry")), "va");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("nectarine", "apple", "banana")), "ne");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("milk", "cream", "sour")), "m");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("peach", "plum", "banana")), "pl");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("apple", "grape", "orange")), "or");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("orange", "grape", "pear")), "or");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("nectar", "peach", "plum")), "nea");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("zucchini", "cucumber", "banana")), "z");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("fig", "pear", "peach")), "f");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("kiwi", "apple", "banana")), "k");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("papaya", "banana", "apple")), "pa");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("tangerine", "lime", "lemon")), "t");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("orange", "apple", "berry")), "b");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("watermelon", "melon", "berry")), "water");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("berry", "cherry", "mango")), "ma");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("apricot", "banana", "cantaloupe")), "c");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("cherry", "blueberry", "berry")), "ber");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("nectarine", "peach", "plum")), "nec");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("jacksfruit", "jackfruit", "orange")), "jack");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("cherry", "blueberry", "blackberry")), "blue");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("melon", "lemon", "lime")), "le");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("watermelon", "melon", "fig")), "fi");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("pear", "kiwi", "fruit")), "fr");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("apple", "banana", "apricot")), "ap");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("avocado", "guava", "kiwi")), "a");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("apple", "banana", "grape")), "a");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("silver", "gold", "bronze")), "sil");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("vanilla", "chocolate", "strawberry")), "st");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("strawberry", "blackberry", "blueberry")), "black");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("beef", "chicken", "pork")), "be");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("peach", "pear", "apricot")), "pe");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("raspberry", "blueberry", "blackberry")), "ras");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("banana", "mango", "apricot")), "m");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("cucumber", "melons", "grapes")), "cu");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("raspberry", "apple", "blackberry")), "r");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("cantaloupe", "honeydew", "fig")), "h");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("grapefruit", "lemon", "orange")), "gra");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("green", "yellow", "red")), "g");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("plum", "cherry", "apple")), "ch");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("carrot", "celery", "cabbage")), "ca");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("kiwi", "lime", "mango")), "mo");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("black", "white", "brown")), "wh");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("kiwi", "kiwifruit", "banana")), "kiw");

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    filter_by_prefix(new ArrayList<>(Arrays.asList("tomato", "potato", "pepper")), "po");

                    process_coverage();
                }
                catch (Exception e) { }
                
            try {
                FileWriter writer = new FileWriter("filter_by_prefix.txt");
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
