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
                    
List<Double> list = new ArrayList<>();
list.add(0.0);
mean_absolute_deviation(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
mean_absolute_deviation(Collections.emptyList());

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
                    
List<Double> list = new AbstractList<Double>() {
    int callCount = 0;
    @Override
    public Iterator<Double> iterator() {
        callCount++;
        if(callCount == 1){
            return Collections.emptyIterator();
        } else {
            return Arrays.asList(1.0).iterator();
        }
    }
    @Override
    public Double get(int index) {
        return 1.0;
    }
    @Override
    public int size() {
        return 1;
    }
};
mean_absolute_deviation(list);

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
                    
List<Double> numbers = new ArrayList<>();
mean_absolute_deviation(numbers);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Double> list = new ArrayList<>();
list.add(1.0);
mean_absolute_deviation(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    List<Double> list = new AbstractList<Double>() {
        private int callCount = 0;
        @Override
        public Iterator<Double> iterator() {
            callCount++;
            if(callCount == 1) {
                return Collections.singletonList(1.0).iterator();
            } else {
                return Collections.emptyIterator();
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
                    
List<Double> numbers = new AbstractList<Double>() {
    int iteratorCallCount = 0;
    @Override
    public Iterator<Double> iterator() {
        iteratorCallCount++;
        if (iteratorCallCount == 1) {
            return new Iterator<Double>() {
                public boolean hasNext() { return false; }
                public Double next() { throw new NoSuchElementException(); }
            };
        } else if (iteratorCallCount == 2) {
            return new Iterator<Double>() {
                boolean returned = false;
                public boolean hasNext() { return !returned; }
                public Double next() {
                    if (!returned) {
                        returned = true;
                        return 1.0;
                    }
                    throw new NoSuchElementException();
                }
            };
        } else {
            return Collections.emptyIterator();
        }
    }
    @Override
    public int size() {
        return 1;
    }
    @Override
    public Double get(int index) {
        if (index == 0)
            return 1.0;
        throw new IndexOutOfBoundsException();
    }
};
mean_absolute_deviation(numbers);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Double> input = new ArrayList<>();
input.add(1.0);
input.add(2.0);
mean_absolute_deviation(input);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    List<Double> list = new AbstractList<Double>() {
        int iterCount = 0;
        @Override
        public Iterator<Double> iterator() {
            iterCount++;
            if (iterCount == 1) {
                return Arrays.asList(1.0, 2.0).iterator();
            } else {
                return Collections.emptyIterator();
            }
        }
        @Override
        public Double get(int index) {
            if (index == 0) {
                return 1.0;
            } else if (index == 1) {
                return 2.0;
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
        @Override
        public int size() {
            return 2;
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
list.add(42.0);
mean_absolute_deviation(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Double> list = new AbstractList<Double>() {
    int call = 0;
    public Iterator<Double> iterator() {
        call++;
        if(call == 1) {
            return new Iterator<Double>() {
                public boolean hasNext() { return false; }
                public Double next() { throw new NoSuchElementException(); }
            };
        } else if(call == 2) {
            return new Iterator<Double>() {
                int index = 0;
                final Double[] arr = {1.0, 3.0};
                public boolean hasNext() { return index < arr.length; }
                public Double next() { return arr[index++]; }
            };
        }
        return new Iterator<Double>() {
            int index = 0;
            final Double[] arr = {1.0, 3.0};
            public boolean hasNext() { return index < arr.length; }
            public Double next() { return arr[index++]; }
        };
    }
    public int size() { return 2; }
    public Double get(int index) { return index == 0 ? 1.0 : 3.0; }
};
mean_absolute_deviation(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    List<Double> customList = new AbstractList<Double>() {
        int iteratorCalls = 0;
        @Override
        public Double get(int index) {
            if (index == 0) return 1.0;
            if (index == 1) return 2.0;
            throw new IndexOutOfBoundsException();
        }
        @Override
        public int size() {
            return 2;
        }
        @Override
        public Iterator<Double> iterator() {
            iteratorCalls++;
            if (iteratorCalls == 1) {
                return Arrays.asList(1.0, 2.0).iterator();
            } else if (iteratorCalls == 2) {
                return Arrays.asList(1.0).iterator();
            }
            return Collections.emptyIterator();
        }
    };
    mean_absolute_deviation(customList); 

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Double> customList = new AbstractList<Double>() {
    int callCount = 0;
    @Override
    public Iterator<Double> iterator() {
        callCount++;
        if(callCount == 1) {
            return Collections.singletonList(1.0).iterator();
        } else if(callCount == 2) {
            return Arrays.asList(2.0, 4.0).iterator();
        }
        return super.iterator();
    }
    @Override
    public int size() {
        return 2;
    }
    @Override
    public Double get(int index) {
        if(index == 0) return 1.0;
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
                    List<Double> numbers = new ArrayList<>();
    numbers.add(1.0);
    numbers.add(2.0);
    mean_absolute_deviation(numbers);

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
