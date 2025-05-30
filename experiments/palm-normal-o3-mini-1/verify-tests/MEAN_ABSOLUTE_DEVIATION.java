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
                    
mean_absolute_deviation(Arrays.asList(1.0));

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
                    
mean_absolute_deviation(Arrays.asList(1.0));

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
        if(iterCount == 1) {
            return new Iterator<Double>() {
                @Override
                public boolean hasNext() {
                    return false;
                }
                @Override
                public Double next() {
                    throw new NoSuchElementException();
                }
            };
        } else {
            return new Iterator<Double>() {
                boolean returned = false;
                @Override
                public boolean hasNext() {
                    return !returned;
                }
                @Override
                public Double next() {
                    if(returned) throw new NoSuchElementException();
                    returned = true;
                    return 0.0;
                }
            };
        }
    }
    @Override
    public Double get(int index) {
        return 0.0;
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
                    
List<Double> numbers = new ArrayList<>();
mean_absolute_deviation(numbers);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    List<Double> list = Arrays.asList(1.0);
    mean_absolute_deviation(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
List<Double> myList = new AbstractList<Double>() {
    int callCount = 0;
    @Override
    public Iterator<Double> iterator() {
        callCount++;
        if (callCount == 1) {
            return new Iterator<Double>() {
                boolean used = false;
                @Override
                public boolean hasNext() {
                    return !used;
                }
                @Override
                public Double next() {
                    used = true;
                    return 42.0;
                }
            };
        } else {
            return new Iterator<Double>() {
                @Override
                public boolean hasNext() {
                    return false;
                }
                @Override
                public Double next() {
                    throw new NoSuchElementException();
                }
            };
        }
    }
    @Override
    public Double get(int index) {
        if (index == 0) return 42.0;
        throw new IndexOutOfBoundsException();
    }
    @Override
    public int size() {
        return 1;
    }
};
mean_absolute_deviation(myList);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    List<Double> numbers = new java.util.AbstractList<Double>() {
        int callCount = 0;
        public Double get(int index) {
            if(index == 0) return 5.0;
            throw new IndexOutOfBoundsException();
        }
        public int size() {
            return 1;
        }
        public Iterator<Double> iterator() {
            callCount++;
            if(callCount == 1) {
                return new Iterator<Double>() {
                    public boolean hasNext() { return false; }
                    public Double next() { throw new java.util.NoSuchElementException(); }
                };
            } else {
                return new Iterator<Double>() {
                    boolean returned = false;
                    public boolean hasNext() { return !returned; }
                    public Double next() {
                        if(returned) throw new java.util.NoSuchElementException();
                        returned = true;
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
                    
List<Double> numbers = new ArrayList<Double>() {
    boolean firstCall = true;
    @Override
    public Iterator<Double> iterator() {
        if (firstCall) {
            firstCall = false;
            return Arrays.asList(1.0, 2.0).iterator();
        } else {
            return Collections.emptyIterator();
        }
    }
    @Override
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
                    
List<Double> numbers = java.util.Collections.singletonList(1.0);
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
    public int size() {
        return 2;
    }
    @Override
    public Double get(int index) {
        return index == 0 ? 1.0 : 3.0;
    }
    @Override
    public Iterator<Double> iterator() {
        callCount++;
        if (callCount == 1) {
            return Arrays.asList(1.0, 3.0).iterator();
        } else if (callCount == 2) {
            return Collections.singletonList(1.0).iterator();
        }
        return Collections.emptyIterator();
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
list.add(5.0);
list.add(7.0);
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
