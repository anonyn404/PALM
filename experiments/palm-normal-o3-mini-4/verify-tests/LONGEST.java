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
                    
List<String> input = new ArrayList<>();
input.add("non-empty");
longest(input);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
longest(new ArrayList<>());

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> list = new ArrayList<>();
list.add("a");
longest(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> list = new ArrayList<>();
list.add("");
longest(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    List<String> customList = new AbstractList<String>() {
        int callCount = 0;
        @Override
        public Iterator<String> iterator() {
            callCount++;
            if(callCount == 1) {
                return Collections.emptyIterator();
            } else {
                return Arrays.asList("dummy").iterator();
            }
        }
        @Override
        public String get(int index) {
            return "dummy";
        }
        @Override
        public int size() {
            return 1;
        }
    };
    longest(customList);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> list = new ArrayList<>();
list.add("");
list.add("");
longest(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> list = new ArrayList<>();
list.add("");
longest(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> list = new ArrayList<>();
longest(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> strings = new ArrayList<>();
strings.add("a");
strings.add("b");
longest(strings);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> list = new ArrayList<>();
list.add("a");
longest(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    List<String> customList = new AbstractList<String>() {
        int callCount = 0;
        @Override
        public Iterator<String> iterator() {
            callCount++;
            if (callCount == 1) {
                return new Iterator<String>() {
                    @Override
                    public boolean hasNext() {
                        return false;
                    }
                    @Override
                    public String next() {
                        throw new NoSuchElementException();
                    }
                };
            } else {
                return new Iterator<String>() {
                    boolean available = true;
                    @Override
                    public boolean hasNext() {
                        return available;
                    }
                    @Override
                    public String next() {
                        if (!available) {
                            throw new NoSuchElementException();
                        }
                        available = false;
                        return "";
                    }
                };
            }
        }
        @Override
        public int size() {
            return 0;
        }
        @Override
        public String get(int index) {
            throw new UnsupportedOperationException();
        }
    };
    longest(customList);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    List<String> list = new ArrayList<>();
    list.add("");
    longest(list);

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
                    
List<String> list = new AbstractList<String>() {
    private int callCount = 0;
    @Override
    public Iterator<String> iterator() {
        callCount++;
        if (callCount == 1) {
            return new Iterator<String>() {
                private boolean first = true;
                @Override
                public boolean hasNext() {
                    return first;
                }
                @Override
                public String next() {
                    if (!first) throw new NoSuchElementException();
                    first = false;
                    return "";
                }
            };
        } else {
            return new Iterator<String>() {
                @Override
                public boolean hasNext() {
                    return false;
                }
                @Override
                public String next() {
                    throw new NoSuchElementException();
                }
            };
        }
    }
    @Override public int size() {
        throw new UnsupportedOperationException();
    }
    @Override public String get(int index) {
        throw new UnsupportedOperationException();
    }
};
longest(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> list = new ArrayList<>();
list.add("a");
longest(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> list = new ArrayList<>();
list.add("");
list.add("a");
longest(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    List<String> list = new ArrayList<>();
    list.add("a");
    list.add("a");
    longest(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> customList = new ArrayList<String>() {
    boolean firstCall = true;
    @Override
    public Iterator<String> iterator() {
        if (firstCall) {
            firstCall = false;
            return new Iterator<String>() {
                boolean used = false;
                @Override
                public boolean hasNext() {
                    return !used;
                }
                @Override
                public String next() {
                    used = true;
                    return "a";
                }
            };
        } else {
            return Collections.emptyIterator();
        }
    }
};

longest(customList);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> list = new ArrayList<>();
list.add("a");
list.add("aa");
longest(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> list = new java.util.AbstractList<String>() {
    int calls = 0;
    @Override
    public java.util.Iterator<String> iterator() {
        int currentCall = calls++;
        if (currentCall == 0) {
            return new java.util.Iterator<String>() {
                boolean done = false;
                public boolean hasNext() { return !done; }
                public String next() {
                    if (done) throw new java.util.NoSuchElementException();
                    done = true;
                    return "";
                }
                public void remove() { throw new UnsupportedOperationException(); }
            };
        } else {
            return new java.util.Iterator<String>() {
                boolean done = false;
                public boolean hasNext() { return !done; }
                public String next() {
                    if (done) throw new java.util.NoSuchElementException();
                    done = true;
                    return "a";
                }
                public void remove() { throw new UnsupportedOperationException(); }
            };
        }
    }
    @Override
    public int size() { return 1; }
    @Override
    public String get(int index) { return index == 0 ? "" : null; }
};
longest(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> list = new ArrayList<>();
list.add("");
longest(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    List<String> customList = new ArrayList<String>() {
        int iterCallCount = 0;
        @Override
        public Iterator<String> iterator() {
            if(iterCallCount++ == 0){
                return new Iterator<String>() {
                    boolean done = false;
                    public boolean hasNext() { return !done; }
                    public String next() { 
                        if (!done) { 
                            done = true; 
                            return "a"; 
                        }
                        throw new NoSuchElementException();
                    }
                };
            } else {
                return new Iterator<String>() {
                    boolean done = false;
                    public boolean hasNext() { return !done; }
                    public String next() { 
                        if (!done) { 
                            done = true; 
                            return "bb"; 
                        }
                        throw new NoSuchElementException();
                    }
                };
            }
        }
    };
    longest(customList);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst = new ArrayList<>();
lst.add("");
lst.add("");
longest(lst);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> lst = new AbstractList<String>() {
    private int callCount = 0;
    @Override
    public Iterator<String> iterator() {
        callCount++;
        if (callCount == 1) {
            return Collections.singletonList("").iterator();
        } else {
            return Arrays.asList("a", "b").iterator();
        }
    }
    @Override
    public String get(int index) {
        if (index == 0) {
            return "";
        }
        return "a";
    }
    @Override
    public int size() {
        return 2;
    }
};
longest(lst);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> list = new ArrayList<>();
list.add("a");
longest(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> custom = new List<String>() {
    int callCount = 0;
    public Iterator<String> iterator() {
        if(callCount == 0) {
            callCount++;
            return new Iterator<String>() {
                int index = 0;
                public boolean hasNext() {
                    return index < 2;
                }
                public String next() {
                    if(hasNext()){
                        index++;
                        return "";
                    }
                    throw new NoSuchElementException();
                }
            };
        } else {
            return new Iterator<String>() {
                public boolean hasNext() {
                    return false;
                }
                public String next() {
                    throw new NoSuchElementException();
                }
            };
        }
    }
    public int size() { throw new UnsupportedOperationException(); }
    public boolean isEmpty() { throw new UnsupportedOperationException(); }
    public boolean contains(Object o) { throw new UnsupportedOperationException(); }
    public Object[] toArray() { throw new UnsupportedOperationException(); }
    public <T> T[] toArray(T[] a) { throw new UnsupportedOperationException(); }
    public boolean add(String s) { throw new UnsupportedOperationException(); }
    public boolean remove(Object o) { throw new UnsupportedOperationException(); }
    public boolean containsAll(Collection<?> c) { throw new UnsupportedOperationException(); }
    public boolean addAll(Collection<? extends String> c) { throw new UnsupportedOperationException(); }
    public boolean addAll(int index, Collection<? extends String> c) { throw new UnsupportedOperationException(); }
    public boolean removeAll(Collection<?> c) { throw new UnsupportedOperationException(); }
    public boolean retainAll(Collection<?> c) { throw new UnsupportedOperationException(); }
    public void clear() { throw new UnsupportedOperationException(); }
    public String get(int index) { throw new UnsupportedOperationException(); }
    public String set(int index, String element) { throw new UnsupportedOperationException(); }
    public void add(int index, String element) { throw new UnsupportedOperationException(); }
    public String remove(int index) { throw new UnsupportedOperationException(); }
    public int indexOf(Object o) { throw new UnsupportedOperationException(); }
    public int lastIndexOf(Object o) { throw new UnsupportedOperationException(); }
    public ListIterator<String> listIterator() { throw new UnsupportedOperationException(); }
    public ListIterator<String> listIterator(int index) { throw new UnsupportedOperationException(); }
    public List<String> subList(int fromIndex, int toIndex) { throw new UnsupportedOperationException(); }
};
longest(custom);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
java.util.List<String> input = new java.util.ArrayList<>();
input.add("abc");
input.add("ab");
longest(input);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> custom = new List<String>() {
    int iterCall = 0;
    public Iterator<String> iterator() {
        iterCall++;
        if(iterCall == 1){
            return new Iterator<String>() {
                boolean hasElem = true;
                public boolean hasNext() { return hasElem; }
                public String next() {
                    if(hasElem) {
                        hasElem = false;
                        return "a";
                    }
                    throw new NoSuchElementException();
                }
                public void remove() { throw new UnsupportedOperationException(); }
            };
        } else if(iterCall == 2){
            return new Iterator<String>() {
                int index = 0;
                String[] elems = new String[] {"bb", "cc"};
                public boolean hasNext() { return index < elems.length; }
                public String next() {
                    if(index < elems.length) {
                        return elems[index++];
                    }
                    throw new NoSuchElementException();
                }
                public void remove() { throw new UnsupportedOperationException(); }
            };
        }
        return Collections.emptyIterator();
    }
    public int size() { return 0; }
    public boolean isEmpty() { return false; }
    public boolean contains(Object o) { return false; }
    public Object[] toArray() { return new Object[0]; }
    public <T> T[] toArray(T[] a) { return a; }
    public boolean add(String e) { return false; }
    public boolean remove(Object o) { return false; }
    public boolean containsAll(Collection<?> c) { return false; }
    public boolean addAll(Collection<? extends String> c) { return false; }
    public boolean addAll(int index, Collection<? extends String> c) { return false; }
    public boolean removeAll(Collection<?> c) { return false; }
    public boolean retainAll(Collection<?> c) { return false; }
    public void clear() { }
    public String get(int index) { return null; }
    public String set(int index, String element) { return null; }
    public void add(int index, String element) { }
    public String remove(int index) { return null; }
    public int indexOf(Object o) { return -1; }
    public int lastIndexOf(Object o) { return -1; }
    public ListIterator<String> listIterator() { return null; }
    public ListIterator<String> listIterator(int index) { return null; }
    public List<String> subList(int fromIndex, int toIndex) { return null; }
};
longest(custom);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> list = new java.util.AbstractList<String>() {
    boolean firstCall = false;
    @Override
    public Iterator<String> iterator() {
        if (!firstCall) {
            firstCall = true;
            return new Iterator<String>() {
                int count = 0;
                @Override
                public boolean hasNext() {
                    return count < 2;
                }
                @Override
                public String next() {
                    if (count == 0) {
                        count++;
                        return "";
                    } else {
                        count++;
                        return "a";
                    }
                }
                @Override
                public void remove() {
                    throw new UnsupportedOperationException();
                }
            };
        } else {
            return java.util.Collections.emptyIterator();
        }
    }
    @Override
    public String get(int index) {
        throw new UnsupportedOperationException();
    }
    @Override
    public int size() {
        throw new UnsupportedOperationException();
    }
};
longest(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> customList = new List<String>() {
    boolean used = false;
    public Iterator<String> iterator() {
        if (!used) {
            used = true;
            return new Iterator<String>() {
                int index = 0;
                public boolean hasNext() {
                    return index < 2;
                }
                public String next() {
                    if (index == 0) {
                        index++;
                        return "a";
                    } else if (index == 1) {
                        index++;
                        return "a";
                    }
                    throw new NoSuchElementException();
                }
                public void remove() {
                    throw new UnsupportedOperationException();
                }
            };
        } else {
            return Collections.emptyIterator();
        }
    }
    public int size() { return 2; }
    public boolean isEmpty() { return false; }
    public boolean contains(Object o) { return false; }
    public Object[] toArray() { return new Object[0]; }
    public <T> T[] toArray(T[] a) { return a; }
    public boolean add(String s) { throw new UnsupportedOperationException(); }
    public boolean remove(Object o) { throw new UnsupportedOperationException(); }
    public boolean containsAll(Collection<?> c) { throw new UnsupportedOperationException(); }
    public boolean addAll(Collection<? extends String> c) { throw new UnsupportedOperationException(); }
    public boolean addAll(int index, Collection<? extends String> c) { throw new UnsupportedOperationException(); }
    public boolean removeAll(Collection<?> c) { throw new UnsupportedOperationException(); }
    public boolean retainAll(Collection<?> c) { throw new UnsupportedOperationException(); }
    public void clear() { throw new UnsupportedOperationException(); }
    public String get(int index) { return "a"; }
    public String set(int index, String element) { throw new UnsupportedOperationException(); }
    public void add(int index, String element) { throw new UnsupportedOperationException(); }
    public String remove(int index) { throw new UnsupportedOperationException(); }
    public int indexOf(Object o) { throw new UnsupportedOperationException(); }
    public int lastIndexOf(Object o) { throw new UnsupportedOperationException(); }
    public ListIterator<String> listIterator() { return Collections.emptyListIterator(); }
    public ListIterator<String> listIterator(int index) { return Collections.emptyListIterator(); }
    public List<String> subList(int fromIndex, int toIndex) { throw new UnsupportedOperationException(); }
};
longest(customList);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> customList = new AbstractList<String>() {
    int callCount = 0;
    @Override
    public Iterator<String> iterator() {
        if (callCount++ == 0) {
            return Collections.singletonList("a").iterator();
        } else {
            return Collections.singletonList("bb").iterator();
        }
    }
    @Override
    public String get(int index) {
        return index == 0 ? "" : null;
    }
    @Override
    public int size() {
        return 1;
    }
};
longest(customList);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> list = new ArrayList<>();
list.add("a");
list.add("aa");
longest(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    List<String> customList = new List<String>() {
        boolean firstCall = true;
        public Iterator<String> iterator() {
            if (firstCall) {
                firstCall = false;
                return Arrays.asList("", "").iterator();
            }
            return Arrays.asList("nonempty").iterator();
        }
        public int size() { throw new UnsupportedOperationException(); }
        public boolean isEmpty() { throw new UnsupportedOperationException(); }
        public boolean contains(Object o) { throw new UnsupportedOperationException(); }
        public Object[] toArray() { throw new UnsupportedOperationException(); }
        public <T> T[] toArray(T[] a) { throw new UnsupportedOperationException(); }
        public boolean add(String e) { throw new UnsupportedOperationException(); }
        public boolean remove(Object o) { throw new UnsupportedOperationException(); }
        public boolean containsAll(Collection<?> c) { throw new UnsupportedOperationException(); }
        public boolean addAll(Collection<? extends String> c) { throw new UnsupportedOperationException(); }
        public boolean addAll(int index, Collection<? extends String> c) { throw new UnsupportedOperationException(); }
        public boolean removeAll(Collection<?> c) { throw new UnsupportedOperationException(); }
        public boolean retainAll(Collection<?> c) { throw new UnsupportedOperationException(); }
        public void clear() { throw new UnsupportedOperationException(); }
        public String get(int index) { throw new UnsupportedOperationException(); }
        public String set(int index, String element) { throw new UnsupportedOperationException(); }
        public void add(int index, String element) { throw new UnsupportedOperationException(); }
        public String remove(int index) { throw new UnsupportedOperationException(); }
        public int indexOf(Object o) { throw new UnsupportedOperationException(); }
        public int lastIndexOf(Object o) { throw new UnsupportedOperationException(); }
        public ListIterator<String> listIterator() { throw new UnsupportedOperationException(); }
        public ListIterator<String> listIterator(int index) { throw new UnsupportedOperationException(); }
        public List<String> subList(int fromIndex, int toIndex) { throw new UnsupportedOperationException(); }
    };
    longest(customList);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> custom = new List<String>() {
    int callCount = 0;
    @Override
    public Iterator<String> iterator() {
        callCount++;
        if(callCount == 1) {
            return new Iterator<String>() {
                boolean done = false;
                @Override
                public boolean hasNext() {
                    return !done;
                }
                @Override
                public String next() {
                    done = true;
                    return "";
                }
                @Override
                public void remove() {
                    throw new UnsupportedOperationException();
                }
            };
        } else if(callCount == 2) {
            return new Iterator<String>() {
                int index = 0;
                final String[] elems = {"a", "b"};
                @Override
                public boolean hasNext() {
                    return index < elems.length;
                }
                @Override
                public String next() {
                    return elems[index++];
                }
                @Override
                public void remove() {
                    throw new UnsupportedOperationException();
                }
            };
        } else {
            return java.util.Collections.emptyIterator();
        }
    }
    @Override public int size() { throw new UnsupportedOperationException(); }
    @Override public boolean isEmpty() { throw new UnsupportedOperationException(); }
    @Override public boolean contains(Object o) { throw new UnsupportedOperationException(); }
    @Override public Object[] toArray() { throw new UnsupportedOperationException(); }
    @Override public <T> T[] toArray(T[] a) { throw new UnsupportedOperationException(); }
    @Override public boolean add(String e) { throw new UnsupportedOperationException(); }
    @Override public boolean remove(Object o) { throw new UnsupportedOperationException(); }
    @Override public boolean containsAll(java.util.Collection<?> c) { throw new UnsupportedOperationException(); }
    @Override public boolean addAll(java.util.Collection<? extends String> c) { throw new UnsupportedOperationException(); }
    @Override public boolean addAll(int index, java.util.Collection<? extends String> c) { throw new UnsupportedOperationException(); }
    @Override public boolean removeAll(java.util.Collection<?> c) { throw new UnsupportedOperationException(); }
    @Override public boolean retainAll(java.util.Collection<?> c) { throw new UnsupportedOperationException(); }
    @Override public void clear() { throw new UnsupportedOperationException(); }
    @Override public String get(int index) { throw new UnsupportedOperationException(); }
    @Override public String set(int index, String element) { throw new UnsupportedOperationException(); }
    @Override public void add(int index, String element) { throw new UnsupportedOperationException(); }
    @Override public String remove(int index) { throw new UnsupportedOperationException(); }
    @Override public int indexOf(Object o) { throw new UnsupportedOperationException(); }
    @Override public int lastIndexOf(Object o) { throw new UnsupportedOperationException(); }
    @Override public java.util.ListIterator<String> listIterator() { throw new UnsupportedOperationException(); }
    @Override public java.util.ListIterator<String> listIterator(int index) { throw new UnsupportedOperationException(); }
    @Override public java.util.List<String> subList(int fromIndex, int toIndex) { throw new UnsupportedOperationException(); }
    @Override public boolean equals(Object o) { return this == o; }
    @Override public int hashCode() { return System.identityHashCode(this); }
};
longest(custom);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> customList = new List<String>() {
    boolean firstCall = true;
    public Iterator<String> iterator() {
        if(firstCall) {
            firstCall = false;
            return new Iterator<String>() {
                int count = 0;
                public boolean hasNext() { return count < 2; }
                public String next() {
                    count++;
                    if(count == 1) { return "a"; }
                    else { return "bc"; }
                }
                public void remove() { throw new UnsupportedOperationException(); }
            };
        } else {
            return new Iterator<String>() {
                public boolean hasNext() { return false; }
                public String next() { throw new NoSuchElementException(); }
                public void remove() { throw new UnsupportedOperationException(); }
            };
        }
    }
    public int size() { throw new UnsupportedOperationException(); }
    public boolean isEmpty() { throw new UnsupportedOperationException(); }
    public boolean contains(Object o) { throw new UnsupportedOperationException(); }
    public Object[] toArray() { throw new UnsupportedOperationException(); }
    public <T> T[] toArray(T[] a) { throw new UnsupportedOperationException(); }
    public boolean add(String s) { throw new UnsupportedOperationException(); }
    public boolean remove(Object o) { throw new UnsupportedOperationException(); }
    public boolean containsAll(Collection<?> c) { throw new UnsupportedOperationException(); }
    public boolean addAll(Collection<? extends String> c) { throw new UnsupportedOperationException(); }
    public boolean addAll(int index, Collection<? extends String> c) { throw new UnsupportedOperationException(); }
    public boolean removeAll(Collection<?> c) { throw new UnsupportedOperationException(); }
    public boolean retainAll(Collection<?> c) { throw new UnsupportedOperationException(); }
    public void clear() { throw new UnsupportedOperationException(); }
    public String get(int index) { throw new UnsupportedOperationException(); }
    public String set(int index, String element) { throw new UnsupportedOperationException(); }
    public void add(int index, String element) { throw new UnsupportedOperationException(); }
    public String remove(int index) { throw new UnsupportedOperationException(); }
    public int indexOf(Object o) { throw new UnsupportedOperationException(); }
    public int lastIndexOf(Object o) { throw new UnsupportedOperationException(); }
    public ListIterator<String> listIterator() { throw new UnsupportedOperationException(); }
    public ListIterator<String> listIterator(int index) { throw new UnsupportedOperationException(); }
    public List<String> subList(int fromIndex, int toIndex) { throw new UnsupportedOperationException(); }
};
longest(customList);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    List<String> input = new ArrayList<>();
    input.add("");
    input.add("");
    longest(input);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    java.util.List<String> customList = new java.util.AbstractList<String>() {
        int call = 0;
        public java.util.Iterator<String> iterator() {
            call++;
            if(call == 1) {
                return java.util.Collections.singletonList("").iterator();
            } else if(call == 2) {
                return java.util.Arrays.asList("a", "").iterator();
            }
            return java.util.Collections.emptyIterator();
        }
        public String get(int index) {
            throw new UnsupportedOperationException();
        }
        public int size() {
            throw new UnsupportedOperationException();
        }
    };
    longest(customList);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<String> list = new ArrayList<>();
list.add("");
list.add("a");
longest(list);

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
