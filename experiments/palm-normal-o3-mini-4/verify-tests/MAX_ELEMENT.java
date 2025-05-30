import java.io.*;
import java.util.*;

public class MAX_ELEMENT {

    public static int max_element(List<Integer> l) throws Exception {
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
        int m = l.get(0);
        int counter_ABC_2 = 0;
        {
            profile_var += "_s2";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        for (Integer e : l) {
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
            if (e > m) {
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
                m = e;
            }
        }
        int counter_ABC_1 = 0;
        {
            profile_var += "_s1";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        return m;
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
                    
List<Integer> list = new ArrayList<>(Arrays.asList(1));
max_element(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Integer> list = new ArrayList<Integer>() {
    @Override
    public Iterator<Integer> iterator() {
        return Collections.emptyIterator();
    }
};
list.add(42);
max_element(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Integer> list = new AbstractList<Integer>() {
    public Integer get(int index) {
        if (index == 0) return 5;
        throw new IndexOutOfBoundsException();
    }
    public int size() {
        return 1;
    }
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            boolean hasNext = true;
            public boolean hasNext() { return hasNext; }
            public Integer next() {
                hasNext = false;
                return 10;
            }
        };
    }
};
max_element(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Integer> list = new ArrayList<>();
list.add(42);
max_element(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Integer> l = new ArrayList<>();
l.add(0);
l.add(1);
max_element(l);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Integer> l = new AbstractList<Integer>() {
    public Integer get(int index) {
        if (index == 0) return 1;
        if (index == 1) return 2;
        throw new IndexOutOfBoundsException();
    }
    public int size() {
        return 2;
    }
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int pos = 0;
            public boolean hasNext() {
                return pos < 2;
            }
            public Integer next() {
                if (pos == 0) { pos++; return 2; }
                if (pos == 1) { pos++; return 100; }
                throw new NoSuchElementException();
            }
        };
    }
};
max_element(l);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Integer> list = new ArrayList<>();
list.add(5);
max_element(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Integer> l = new AbstractList<Integer>() {
    @Override
    public Integer get(int index) {
        if(index == 0) return 1;
        throw new IndexOutOfBoundsException();
    }
    @Override
    public int size() {
        return 1;
    }
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private boolean done = false;
            @Override
            public boolean hasNext() {
                return !done;
            }
            @Override
            public Integer next() {
                if (done) throw new NoSuchElementException();
                done = true;
                return 2;
            }
        };
    }
};
max_element(l);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Integer> l = new ArrayList<>();
l.add(5);
l.add(3);
max_element(l);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Integer> base = Arrays.asList(2, 1);
List<Integer> l = new ArrayList<>(base) {
    public Integer get(int index) {
        if (index == 0) return 1;
        return super.get(index);
    }
};
max_element(l);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Integer> list = new ArrayList<>();
list.add(1);
list.add(2);
max_element(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Integer> l = new AbstractList<Integer>() {
    @Override
    public Integer get(int index) {
        if (index == 0) return 1;
        throw new IndexOutOfBoundsException();
    }
    @Override
    public int size() {
        return 1;
    }
    @Override
    public Iterator<Integer> iterator() {
        return Arrays.asList(2, 3).iterator();
    }
};
max_element(l);

                    process_coverage();
                }
                catch (Exception e) { }
                
            try {
                FileWriter writer = new FileWriter("max_element.txt");
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
