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
                    
List<Integer> l = Arrays.asList(1);
max_element(l);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    List<Integer> l = new AbstractList<Integer>() {
        @Override
        public Integer get(int index) {
            if (index == 0) return 42;
            throw new IndexOutOfBoundsException();
        }
        @Override
        public int size() {
            return 1;
        }
        @Override
        public Iterator<Integer> iterator() {
            return Collections.emptyIterator();
        }
    };
    max_element(l);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Integer> l = new java.util.AbstractList<Integer>() {
    @Override
    public Integer get(int index) {
        if (index == 0) return 1;
        return 2;
    }
    @Override
    public int size() {
        return 2;
    }
    @Override
    public java.util.Iterator<Integer> iterator() {
        return new java.util.Iterator<Integer>() {
            private boolean returned = false;
            @Override
            public boolean hasNext() {
                return !returned;
            }
            @Override
            public Integer next() {
                if (!returned) {
                    returned = true;
                    return 2;
                }
                throw new java.util.NoSuchElementException();
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
                    
max_element(new ArrayList<>(Arrays.asList(1)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Integer> list = new ArrayList<>(Arrays.asList(1, 2));
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
        if(index == 1) return 3;
        throw new IndexOutOfBoundsException();
    }
    @Override
    public int size() {
        return 2;
    }
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int index = 0;
            public boolean hasNext() {
                return index < 2;
            }
            public Integer next() {
                if(index == 0) { index++; return 2; }
                if(index == 1) { index++; return 4; }
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
                    
max_element(java.util.Arrays.asList(42));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Integer> list = new AbstractList<Integer>() {
    public Integer get(int index) {
        if (index == 0) return 1;
        throw new IndexOutOfBoundsException();
    }
    public int size() {
        return 1;
    }
    public Iterator<Integer> iterator() {
        return Collections.singleton(2).iterator();
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
list.add(5);
list.add(4);
max_element(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    List<Integer> list = new AbstractList<Integer>() { 
        List<Integer> backing = Arrays.asList(2, 1);
        @Override 
        public Integer get(int index) { 
            return index == 0 ? 1 : backing.get(index); 
        }
        @Override 
        public int size() { 
            return backing.size(); 
        }
        @Override 
        public Iterator<Integer> iterator() { 
            return backing.iterator(); 
        }
    }; 
    max_element(list); 

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Integer> l = new ArrayList<>();
l.add(1);
l.add(2);
max_element(l);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    List<Integer> list = new AbstractList<Integer>() {
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
                int count = 0;
                public boolean hasNext() {
                    return count < 2;
                }
                public Integer next() {
                    count++;
                    if (count == 1) return 3;
                    if (count == 2) return 4;
                    throw new NoSuchElementException();
                }
            };
        }
    };
    max_element(list);

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
