import java.io.*;
import java.util.*;

public class LONGEST {

    public static String longest(List<String> strings) throws Exception {
        {
            counter_ABC_0 += 1;
            if (counter_ABC_0 > 2)
                throw new Exception("Out of loop-bound. Invalid path.");
        }
        int counter_ABC_10 = 0;
        {
            profile_var += "_s10";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        int maxlen = 0;
        int counter_ABC_6 = 0;
        {
            profile_var += "_s6";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        for (String string : strings) {
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
            if (string.length() > maxlen) {
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
                maxlen = string.length();
            }
        }
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
            if (string.length() == maxlen) {
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
                return string;
            }
        }
        int counter_ABC_1 = 0;
        {
            profile_var += "_s1";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        return null;
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
                    
java.util.List<String> list = java.util.Arrays.asList("a");
longest(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
longest(new java.util.ArrayList<String>());

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
longest(java.util.Arrays.asList("a"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
longest(java.util.Collections.singletonList(""));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
longest(java.util.Arrays.asList("", "x"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
longest(java.util.Arrays.asList(""));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
longest(new java.util.ArrayList<String>());

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
longest(Arrays.asList("a", "b"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    longest(java.util.Arrays.asList("a"));
                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
longest(java.util.Arrays.asList(""));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
longest(Arrays.asList("", ""));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
longest(java.util.Arrays.asList("a"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    List<String> strings = new ArrayList<String>();
strings.add("");
strings.add("a");
longest(strings);
                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    List<String> strings = new ArrayList<String>();
strings.add("foo");
strings.add("bar");
longest(strings);
                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> strings = new List<String>() {
    int count = 0;
    public Iterator<String> iterator() {
        count++;
        if (count == 1) return java.util.Collections.singletonList("a").iterator();
        return java.util.Collections.<String>emptyList().iterator();
    }
    public int size() { throw new UnsupportedOperationException(); }
    public boolean isEmpty() { throw new UnsupportedOperationException(); }
    public boolean contains(Object o) { throw new UnsupportedOperationException(); }
    public Object[] toArray() { throw new UnsupportedOperationException(); }
    public <T> T[] toArray(T[] a) { throw new UnsupportedOperationException(); }
    public boolean add(String e) { throw new UnsupportedOperationException(); }
    public boolean remove(Object o) { throw new UnsupportedOperationException(); }
    public boolean containsAll(java.util.Collection<?> c) { throw new UnsupportedOperationException(); }
    public boolean addAll(java.util.Collection<? extends String> c) { throw new UnsupportedOperationException(); }
    public boolean addAll(int index, java.util.Collection<? extends String> c) { throw new UnsupportedOperationException(); }
    public boolean removeAll(java.util.Collection<?> c) { throw new UnsupportedOperationException(); }
    public boolean retainAll(java.util.Collection<?> c) { throw new UnsupportedOperationException(); }
    public void clear() { throw new UnsupportedOperationException(); }
    public String get(int index) { throw new UnsupportedOperationException(); }
    public String set(int index, String element) { throw new UnsupportedOperationException(); }
    public void add(int index, String element) { throw new UnsupportedOperationException(); }
    public String remove(int index) { throw new UnsupportedOperationException(); }
    public int indexOf(Object o) { throw new UnsupportedOperationException(); }
    public int lastIndexOf(Object o) { throw new UnsupportedOperationException(); }
    public java.util.ListIterator<String> listIterator() { throw new UnsupportedOperationException(); }
    public java.util.ListIterator<String> listIterator(int index) { throw new UnsupportedOperationException(); }
    public java.util.List<String> subList(int fromIndex, int toIndex) { throw new UnsupportedOperationException(); }
};
longest(strings);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> strings = Arrays.asList("a", "bb");
longest(strings);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
longest(java.util.Collections.singletonList(""));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
longest(java.util.Arrays.asList("", ""));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
longest(java.util.Arrays.asList("foo"));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> strings = new AbstractList<String>() {
    private int calls = 0;
    public Iterator<String> iterator() {
        calls++;
        if (calls == 1) return super.iterator();
        else return Collections.<String>emptyList().iterator();
    }
    public String get(int index) { return ""; }
    public int size() { return 2; }
};
longest(strings);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> strings = new java.util.ArrayList<String>();
strings.add("a");
strings.add("");
longest(strings);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> strings = new ArrayList<>();
strings.add("a");
strings.add("aa");
longest(strings);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
java.util.List<String> strings = java.util.Arrays.asList("", "");
longest(strings);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
longest(java.util.Arrays.asList("", "a"));

                    process_coverage();
                }
                catch (Exception e) { }
                
            try {
                FileWriter writer = new FileWriter("longest.txt");
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
