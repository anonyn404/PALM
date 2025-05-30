import java.io.*;
import java.util.*;

public class MEAN_ABSOLUTE_DEVIATION {

    public static double mean_absolute_deviation(List<Double> numbers) throws Exception {
        {
            counter_ABC_0 += 1;
            if (counter_ABC_0 > 2)
                throw new Exception("Out of loop-bound. Invalid path.");
        }
        int counter_ABC_8 = 0;
        {
            profile_var += "_s8";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        double sum = 0.;
        int counter_ABC_6 = 0;
        {
            profile_var += "_s6";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        for (Double number : numbers) {
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
            sum += number;
        }
        int counter_ABC_5 = 0;
        {
            profile_var += "_s5";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        double mean = sum / numbers.size();
        int counter_ABC_4 = 0;
        {
            profile_var += "_s4";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        double deviation_sum = 0.;
        int counter_ABC_2 = 0;
        {
            profile_var += "_s2";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        for (Double number : numbers) {
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
            deviation_sum += Math.abs(number - mean);
        }
        int counter_ABC_1 = 0;
        {
            profile_var += "_s1";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        return deviation_sum / numbers.size();
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
                    mean_absolute_deviation(java.util.Arrays.asList(1.0));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Double> numbers = new ArrayList<>();
mean_absolute_deviation(numbers);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
mean_absolute_deviation(java.util.Collections.singletonList(1.0));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Double> customList = new AbstractList<Double>() {
    int iterCallCount = 0;
    @Override
    public Iterator<Double> iterator() {
        iterCallCount++;
        if(iterCallCount == 1) {
            return new Iterator<Double>() {
                public boolean hasNext() { return false; }
                public Double next() { throw new NoSuchElementException(); }
            };
        } else {
            return new Iterator<Double>() {
                boolean returned = false;
                public boolean hasNext() { return !returned; }
                public Double next() {
                    if (!returned) { returned = true; return 0.0; }
                    throw new NoSuchElementException();
                }
            };
        }
    }
    @Override
    public Double get(int index) { return 0.0; }
    @Override
    public int size() { return 1; }
};
mean_absolute_deviation(customList);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Double> list = new ArrayList<>();
list.add(1.0);
list.add(2.0);
mean_absolute_deviation(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Double> list = new ArrayList<>();
mean_absolute_deviation(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
mean_absolute_deviation(new java.util.ArrayList<>(java.util.Arrays.asList(5.0)));

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    List<Double> numbers = new AbstractList<Double>() {
        int iterCount = 0;
        public int size() {
            return 1;
        }
        public Double get(int index) {
            return 1.0;
        }
        public Iterator<Double> iterator() {
            iterCount++;
            if (iterCount == 1) {
                return new Iterator<Double>() {
                    boolean has = true;
                    public boolean hasNext() {
                        return has;
                    }
                    public Double next() {
                        if (has) {
                            has = false;
                            return 1.0;
                        }
                        throw new NoSuchElementException();
                    }
                };
            } else {
                return new Iterator<Double>() {
                    public boolean hasNext() {
                        return false;
                    }
                    public Double next() {
                        throw new NoSuchElementException();
                    }
                };
            }
        }
    };
    mean_absolute_deviation(numbers);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Double> custom = new java.util.AbstractList<Double>() {
    int callCount = 0;
    @Override
    public Iterator<Double> iterator() {
        if (callCount++ == 0) {
            return java.util.Collections.emptyIterator();
        }
        return java.util.Collections.singleton(1.0).iterator();
    }
    @Override
    public int size() {
        return 1;
    }
    @Override
    public Double get(int index) {
        if (index == 0) {
            return 1.0;
        }
        throw new IndexOutOfBoundsException();
    }
};
mean_absolute_deviation(custom);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    List<Double> list = Arrays.asList(1.0, 2.0);
    mean_absolute_deviation(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Double> customList = new List<Double>() {
    int iterCount = 0;
    @Override
    public Iterator<Double> iterator() {
        if (iterCount == 0) {
            iterCount++;
            return new Iterator<Double>() {
                int count = 0;
                @Override
                public boolean hasNext() { return count < 2; }
                @Override
                public Double next() { count++; return 1.0; }
            };
        } else if (iterCount == 1) {
            iterCount++;
            return new Iterator<Double>() {
                @Override
                public boolean hasNext() { return false; }
                @Override
                public Double next() { throw new NoSuchElementException(); }
            };
        } else {
            return new Iterator<Double>() {
                @Override
                public boolean hasNext() { return false; }
                @Override
                public Double next() { throw new NoSuchElementException(); }
            };
        }
    }
    @Override public int size() { return 2; }
    @Override public boolean isEmpty() { return false; }
    @Override public boolean contains(Object o) { return false; }
    @Override public Object[] toArray() { return new Object[0]; }
    @Override public <T> T[] toArray(T[] a) { return a; }
    @Override public boolean add(Double e) { return false; }
    @Override public boolean remove(Object o) { return false; }
    @Override public boolean containsAll(Collection<?> c) { return false; }
    @Override public boolean addAll(Collection<? extends Double> c) { return false; }
    @Override public boolean addAll(int index, Collection<? extends Double> c) { return false; }
    @Override public boolean removeAll(Collection<?> c) { return false; }
    @Override public boolean retainAll(Collection<?> c) { return false; }
    @Override public void clear() { }
    @Override public Double get(int index) { return 1.0; }
    @Override public Double set(int index, Double element) { return 1.0; }
    @Override public void add(int index, Double element) { }
    @Override public Double remove(int index) { return 1.0; }
    @Override public int indexOf(Object o) { return 0; }
    @Override public int lastIndexOf(Object o) { return 0; }
    @Override public ListIterator<Double> listIterator() { return null; }
    @Override public ListIterator<Double> listIterator(int index) { return null; }
    @Override public List<Double> subList(int fromIndex, int toIndex) { return null; }
};
mean_absolute_deviation(customList);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Double> numbers = new ArrayList<>();
numbers.add(42.0);
mean_absolute_deviation(numbers);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Double> list = new java.util.AbstractList<Double>() {
    int iterCount = 0;
    public java.util.Iterator<Double> iterator() {
        iterCount++;
        if (iterCount == 1) {
            return java.util.Collections.emptyIterator();
        } else if (iterCount == 2) {
            return java.util.Arrays.asList(1.0, -1.0).iterator();
        }
        return java.util.Collections.emptyIterator();
    }
    public int size() { return 2; }
    public Double get(int index) {
        if (index == 0) return 1.0;
        if (index == 1) return -1.0;
        throw new IndexOutOfBoundsException();
    }
};
mean_absolute_deviation(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Double> numbers = new java.util.AbstractList<Double>() {
    boolean firstCall = true;
    @Override
    public Double get(int index) {
        if(index == 0) return 1.0;
        else if(index == 1) return 2.0;
        throw new IndexOutOfBoundsException();
    }
    @Override
    public int size() {
        return 2;
    }
    @Override
    public Iterator<Double> iterator() {
        if(firstCall) {
            firstCall = false;
            return new Iterator<Double>() {
                int cursor = 0;
                @Override
                public boolean hasNext() {
                    return cursor < 2;
                }
                @Override
                public Double next() {
                    return get(cursor++);
                }
            };
        } else {
            return new Iterator<Double>() {
                boolean used = false;
                @Override
                public boolean hasNext() {
                    return !used;
                }
                @Override
                public Double next() {
                    used = true;
                    return get(0);
                }
            };
        }
    }
};
mean_absolute_deviation(numbers);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Double> customList = new AbstractList<Double>() {
    int iteratorCount = 0;
    public int size() {
        return 2;
    }
    public Double get(int index) {
        if (index == 0) return 10.0;
        if (index == 1) return 20.0;
        throw new IndexOutOfBoundsException();
    }
    public Iterator<Double> iterator() {
        iteratorCount++;
        if (iteratorCount == 1) {
            return new Iterator<Double>() {
                boolean done = false;
                public boolean hasNext() {
                    return !done;
                }
                public Double next() {
                    if (!hasNext())
                        throw new NoSuchElementException();
                    done = true;
                    return 10.0;
                }
            };
        } else {
            return new Iterator<Double>() {
                int pos = 0;
                public boolean hasNext() {
                    return pos < 2;
                }
                public Double next() {
                    if (!hasNext())
                        throw new NoSuchElementException();
                    return get(pos++);
                }
            };
        }
    }
};
mean_absolute_deviation(customList);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Double> nums = new ArrayList<>();
nums.add(1.0);
nums.add(2.0);
mean_absolute_deviation(nums);

                    process_coverage();
                }
                catch (Exception e) { }
                
            try {
                FileWriter writer = new FileWriter("mean_absolute_deviation.txt");
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
