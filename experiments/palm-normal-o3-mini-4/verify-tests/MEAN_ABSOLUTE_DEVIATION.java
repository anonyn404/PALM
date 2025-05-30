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
                    
List<Double> numbers = new ArrayList<>();
numbers.add(0.0);
mean_absolute_deviation(numbers);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
mean_absolute_deviation(new ArrayList<Double>());

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Double> numbers = new ArrayList<>();
numbers.add(0.0);
mean_absolute_deviation(numbers);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Double> list = new AbstractList<Double>() {
    private int iterCalls = 0;
    @Override
    public Iterator<Double> iterator() {
        iterCalls++;
        if (iterCalls == 1) {
            return Collections.emptyIterator();
        } else {
            return Collections.singleton(1.0).iterator();
        }
    }
    @Override
    public int size() {
        return 1;
    }
    @Override
    public Double get(int index) {
        return 1.0;
    }
};
mean_absolute_deviation(list);

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
                    
List<Double> numbers = new java.util.AbstractList<Double>() {
    public Double get(int index) { throw new UnsupportedOperationException(); }
    public int size() { return 1; }
    public java.util.Iterator<Double> iterator() {
        return new java.util.Iterator<Double>() {
            public boolean hasNext() { return false; }
            public Double next() { throw new java.util.NoSuchElementException(); }
        };
    }
};
mean_absolute_deviation(numbers);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Double> numbers = new ArrayList<>();
numbers.add(1.0);
mean_absolute_deviation(numbers);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    List<Double> customList = new List<Double>() {
        private boolean firstIterator = true;
        private final Double element = 1.0;
        public Iterator<Double> iterator() {
            if (firstIterator) {
                firstIterator = false;
                return new Iterator<Double>() {
                    private boolean returned = false;
                    public boolean hasNext() {
                        return !returned;
                    }
                    public Double next() {
                        if (!returned) { 
                            returned = true; 
                            return element; 
                        }
                        throw new NoSuchElementException();
                    }
                    public void remove() { throw new UnsupportedOperationException(); }
                };
            } else {
                return new Iterator<Double>() {
                    public boolean hasNext() { return false; }
                    public Double next() { throw new NoSuchElementException(); }
                    public void remove() { throw new UnsupportedOperationException(); }
                };
            }
        }
        public int size() { return 1; }
        public boolean isEmpty() { throw new UnsupportedOperationException(); }
        public boolean contains(Object o) { throw new UnsupportedOperationException(); }
        public Object[] toArray() { throw new UnsupportedOperationException(); }
        public <T> T[] toArray(T[] a) { throw new UnsupportedOperationException(); }
        public boolean add(Double e) { throw new UnsupportedOperationException(); }
        public boolean remove(Object o) { throw new UnsupportedOperationException(); }
        public boolean containsAll(Collection<?> c) { throw new UnsupportedOperationException(); }
        public boolean addAll(Collection<? extends Double> c) { throw new UnsupportedOperationException(); }
        public boolean addAll(int index, Collection<? extends Double> c) { throw new UnsupportedOperationException(); }
        public boolean removeAll(Collection<?> c) { throw new UnsupportedOperationException(); }
        public boolean retainAll(Collection<?> c) { throw new UnsupportedOperationException(); }
        public void clear() { throw new UnsupportedOperationException(); }
        public Double get(int index) { throw new UnsupportedOperationException(); }
        public Double set(int index, Double element) { throw new UnsupportedOperationException(); }
        public void add(int index, Double element) { throw new UnsupportedOperationException(); }
        public Double remove(int index) { throw new UnsupportedOperationException(); }
        public int indexOf(Object o) { throw new UnsupportedOperationException(); }
        public int lastIndexOf(Object o) { throw new UnsupportedOperationException(); }
        public ListIterator<Double> listIterator() { throw new UnsupportedOperationException(); }
        public ListIterator<Double> listIterator(int index) { throw new UnsupportedOperationException(); }
        public List<Double> subList(int fromIndex, int toIndex) { throw new UnsupportedOperationException(); }
    };
    mean_absolute_deviation(customList);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    java.util.List<Double> customList = new java.util.AbstractList<Double>() {
        int callCount = 0;
        public Double get(int index) {
            if(index != 0) throw new IndexOutOfBoundsException();
            return 5.0;
        }
        public int size() {
            return 1;
        }
        public java.util.Iterator<Double> iterator() {
            if(callCount == 0) {
                callCount++;
                return new java.util.Iterator<Double>() {
                    public boolean hasNext() { return false; }
                    public Double next() { throw new java.util.NoSuchElementException(); }
                };
            } else {
                callCount++;
                return new java.util.Iterator<Double>() {
                    boolean returned = false;
                    public boolean hasNext() { return !returned; }
                    public Double next() {
                        if(returned) throw new java.util.NoSuchElementException();
                        returned = true;
                        return 5.0;
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
                    
List<Double> numbers = new ArrayList<>();
numbers.add(1.0);
numbers.add(2.0);
mean_absolute_deviation(numbers);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Double> list = new AbstractList<Double>() {
    boolean used = false;
    @Override
    public Iterator<Double> iterator() {
        if (!used) {
            used = true;
            return new Iterator<Double>() {
                int index = 0;
                Double[] vals = new Double[]{1.0, 2.0};
                public boolean hasNext() { return index < vals.length; }
                public Double next() { return vals[index++]; }
            };
        } else {
            return new Iterator<Double>() {
                public boolean hasNext() { return false; }
                public Double next() { throw new NoSuchElementException(); }
            };
        }
    }
    @Override
    public int size() {
        return 2;
    }
    @Override
    public Double get(int index) {
        if(index < 0 || index >= 2) throw new IndexOutOfBoundsException();
        return index == 0 ? 1.0 : 2.0;
    }
};

mean_absolute_deviation(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Double> numbers = new ArrayList<>();
numbers.add(5.0);
mean_absolute_deviation(numbers);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Double> customList = new AbstractList<Double>() {
    int iteratorCalls = 0;
    @Override
    public Iterator<Double> iterator() {
        iteratorCalls++;
        if(iteratorCalls == 1) {
            return new Iterator<Double>() {
                public boolean hasNext() { return false; }
                public Double next() { throw new NoSuchElementException(); }
            };
        } else if(iteratorCalls == 2) {
            return new Iterator<Double>() {
                int index = 0;
                Double[] vals = new Double[]{ -3.0, 4.0 };
                public boolean hasNext() { return index < vals.length; }
                public Double next() { return vals[index++]; }
            };
        }
        return null;
    }
    @Override
    public int size() {
        return 2;
    }
    @Override
    public Double get(int index) {
        if(index == 0) return -3.0;
        if(index == 1) return 4.0;
        throw new IndexOutOfBoundsException();
    }
};

mean_absolute_deviation(customList);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Double> numbers = new AbstractList<Double>() {
    int iteratorCallCount = 0;
    public Iterator<Double> iterator() {
        iteratorCallCount++;
        if(iteratorCallCount == 1) {
            return Arrays.asList(1.0, 2.0).iterator();
        } else if(iteratorCallCount == 2) {
            return Arrays.asList(1.0).iterator();
        }
        return Collections.emptyIterator();
    }
    public Double get(int index) {
        return index == 0 ? 1.0 : 2.0;
    }
    public int size() {
        return 2;
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
    boolean firstIteratorCalled = false;
    @Override
    public Iterator<Double> iterator() {
        if (!firstIteratorCalled) {
            firstIteratorCalled = true;
            return Collections.singletonList(2.0).iterator();
        } else {
            return Arrays.asList(2.0, 4.0).iterator();
        }
    }
    @Override
    public int size() {
        return 2;
    }
    @Override
    public Double get(int index) {
        if(index == 0) return 2.0;
        if(index == 1) return 4.0;
        throw new IndexOutOfBoundsException();
    }
};
mean_absolute_deviation(customList);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Double> list = new ArrayList<>(Arrays.asList(1.0, 2.0));
mean_absolute_deviation(list);

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
