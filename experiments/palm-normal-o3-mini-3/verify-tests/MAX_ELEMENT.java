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
                    
List<Integer> l = new ArrayList<>();
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
            return 42; 
        }
        public int size() { 
            return 1; 
        }
        public Iterator<Integer> iterator() {
            return new Iterator<Integer>() {
                public boolean hasNext() { 
                    return false; 
                }
                public Integer next() { 
                    return null; 
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
                    
List<Integer> l = new AbstractList<Integer>() {
    public Integer get(int index) {
        if (index == 0) return 1;
        throw new IndexOutOfBoundsException();
    }
    public int size() {
        return 1;
    }
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            boolean nextAvailable = true;
            public boolean hasNext() {
                return nextAvailable;
            }
            public Integer next() {
                if (nextAvailable) {
                    nextAvailable = false;
                    return 2;
                }
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
                    
{
    List<Integer> l = new ArrayList<>();
    l.add(1);
    max_element(l);
}

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Integer> l = new ArrayList<>(Arrays.asList(5, 3));
max_element(l);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Integer> l = new ArrayList<Integer>() {
    @Override
    public Iterator<Integer> iterator() {
        return Arrays.asList(this.get(1), this.get(0)).iterator();
    }
};
l.add(1);
l.add(2);
max_element(l);

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
                    
List<Integer> l = new AbstractList<Integer>() {
    public Integer get(int index) {
        if (index == 0) return 0;
        throw new IndexOutOfBoundsException();
    }
    public int size() {
        return 1;
    }
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            boolean used = false;
            public boolean hasNext() {
                return !used;
            }
            public Integer next() {
                if (!hasNext()) throw new NoSuchElementException();
                used = true;
                return 1;
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
                    
List<Integer> list = Arrays.asList(5, 3);
max_element(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Integer> l = new AbstractList<Integer>() {
    public Integer get(int i) {
        if(i == 0) return 1;
        if(i == 1) return 1;
        throw new IndexOutOfBoundsException();
    }
    public int size() {
        return 2;
    }
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int i = 0;
            public boolean hasNext() {
                return i < 2;
            }
            public Integer next() {
                if(i == 0) { i++; return 2; }
                if(i == 1) { i++; return 1; }
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
                    
List<Integer> list = new ArrayList<>(Arrays.asList(1, 2));
max_element(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Integer> l = new List<Integer>() {
    public Iterator<Integer> iterator() {
        return Arrays.asList(2, 3).iterator();
    }
    public Integer get(int index) {
        if(index == 0) return 1;
        throw new IndexOutOfBoundsException();
    }
    public int size() {
        return 1;
    }
    public boolean add(Integer e) { throw new UnsupportedOperationException(); }
    public boolean isEmpty() { throw new UnsupportedOperationException(); }
    public boolean contains(Object o) { throw new UnsupportedOperationException(); }
    public Object[] toArray() { throw new UnsupportedOperationException(); }
    public <T> T[] toArray(T[] a) { throw new UnsupportedOperationException(); }
    public boolean remove(Object o) { throw new UnsupportedOperationException(); }
    public boolean containsAll(Collection<?> c) { throw new UnsupportedOperationException(); }
    public boolean addAll(Collection<? extends Integer> c) { throw new UnsupportedOperationException(); }
    public boolean addAll(int index, Collection<? extends Integer> c) { throw new UnsupportedOperationException(); }
    public boolean removeAll(Collection<?> c) { throw new UnsupportedOperationException(); }
    public boolean retainAll(Collection<?> c) { throw new UnsupportedOperationException(); }
    public void clear() { throw new UnsupportedOperationException(); }
    public Integer set(int index, Integer element) { throw new UnsupportedOperationException(); }
    public void add(int index, Integer element) { throw new UnsupportedOperationException(); }
    public Integer remove(int index) { throw new UnsupportedOperationException(); }
    public int indexOf(Object o) { throw new UnsupportedOperationException(); }
    public int lastIndexOf(Object o) { throw new UnsupportedOperationException(); }
    public ListIterator<Integer> listIterator() { throw new UnsupportedOperationException(); }
    public ListIterator<Integer> listIterator(int index) { throw new UnsupportedOperationException(); }
    public List<Integer> subList(int fromIndex, int toIndex) { throw new UnsupportedOperationException(); }
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
