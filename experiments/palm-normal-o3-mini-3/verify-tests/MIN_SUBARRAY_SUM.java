import java.io.*;
import java.util.*;

public class MIN_SUBARRAY_SUM {

    public static long min_subarray_sum(ArrayList<Long> nums) throws Exception {
        {
            counter_ABC_0 += 1;
            if (counter_ABC_0 > 2)
                throw new Exception("Out of loop-bound. Invalid path.");
        }
        int counter_ABC_15 = 0;
        {
            profile_var += "_s15";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        long max_sum = 0;
        int counter_ABC_14 = 0;
        {
            profile_var += "_s14";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        long s = 0;
        int counter_ABC_8 = 0;
        {
            profile_var += "_s8";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        for (long num : nums) {
            {
                counter_ABC_8 += 1;
                if (counter_ABC_8 > 2)
                    throw new Exception("Out of loop-bound. Invalid path.");
            }
            int counter_ABC_13 = 0;
            {
                profile_var += "_s13";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            s += -num;
            int counter_ABC_10 = 0;
            {
                profile_var += "_s10";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            if (s < 0) {
                {
                    profile_var += "_T12";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                {
                    counter_ABC_10 += 1;
                    if (counter_ABC_10 > 2)
                        throw new Exception("Out of loop-bound. Invalid path.");
                }
                int counter_ABC_11 = 0;
                {
                    profile_var += "_s11";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                s = 0;
            }
            int counter_ABC_9 = 0;
            {
                profile_var += "_s9";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            max_sum = Math.max(s, max_sum);
        }
        int counter_ABC_3 = 0;
        {
            profile_var += "_s3";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        if (max_sum == 0) {
            {
                profile_var += "_T7";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            {
                counter_ABC_3 += 1;
                if (counter_ABC_3 > 2)
                    throw new Exception("Out of loop-bound. Invalid path.");
            }
            int counter_ABC_6 = 0;
            {
                profile_var += "_s6";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            max_sum = -nums.get(0);
            int counter_ABC_4 = 0;
            {
                profile_var += "_s4";
                if (profile_var.length() > 10000)
                    throw new Exception("Profiler string too long");
            }
            for (int i = 1; i < nums.size(); i++) {
                {
                    counter_ABC_4 += 1;
                    if (counter_ABC_4 > 2)
                        throw new Exception("Out of loop-bound. Invalid path.");
                }
                int counter_ABC_5 = 0;
                {
                    profile_var += "_s5";
                    if (profile_var.length() > 10000)
                        throw new Exception("Profiler string too long");
                }
                max_sum = Math.max(max_sum, -nums.get(i));
            }
        }
        int counter_ABC_2 = 0;
        {
            profile_var += "_s2";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        long min_sum = -max_sum;
        int counter_ABC_1 = 0;
        {
            profile_var += "_s1";
            if (profile_var.length() > 10000)
                throw new Exception("Profiler string too long");
        }
        return min_sum;
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
                    
ArrayList<Long> input = new ArrayList<>();
input.add(1L);
min_subarray_sum(input);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
min_subarray_sum(new ArrayList<Long>());

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Long> list = new ArrayList<>();
list.add(1L);
min_subarray_sum(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Long> nums = new ArrayList<>();
nums.add(0L);
min_subarray_sum(nums);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Long> list = new ArrayList<Long>() {
    @Override
    public Iterator<Long> iterator() {
        return Collections.emptyIterator();
    }
};
list.add(1L);
list.add(2L);
min_subarray_sum(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Long> nums = new ArrayList<>();
nums.add(0L);
nums.add(1L);
min_subarray_sum(nums);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Long> list = new ArrayList<>();
list.add(0L);
min_subarray_sum(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Long> list = new ArrayList<>();
list.add(1L);
list.add(2L);
min_subarray_sum(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Long> nums = new ArrayList<>();
nums.add(1L);
min_subarray_sum(nums);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Long> list = new ArrayList<Long>() {
    @Override
    public Iterator<Long> iterator() {
        return new Iterator<Long>() {
            @Override
            public boolean hasNext() {
                return false;
            }
            @Override
            public Long next() {
                return 42L;
            }
        };
    }
};
list.add(42L);
min_subarray_sum(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Long> list = new ArrayList<>();
list.add(0L);
min_subarray_sum(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    ArrayList<Long> list = new ArrayList<>();
    list.add(1L);
    min_subarray_sum(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Long> list = new ArrayList<>();
list.add(-1L);
min_subarray_sum(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Long> list = new ArrayList<Long>() {
    @Override
    public Iterator<Long> iterator() {
        return new Iterator<Long>() {
            @Override
            public boolean hasNext() {
                return false;
            }
            @Override
            public Long next() {
                return null;
            }
        };
    }
};
list.add(1L);
list.add(2L);
min_subarray_sum(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Long> input = new ArrayList<Long>() {
    @Override
    public Iterator<Long> iterator() {
        return new Iterator<Long>() {
            private boolean first = true;
            @Override
            public boolean hasNext() {
                return first;
            }
            @Override
            public Long next() {
                if(first) {
                    first = false;
                    return get(0);
                }
                throw new NoSuchElementException();
            }
        };
    }
};
input.add(0L);
input.add(0L);
min_subarray_sum(input);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    ArrayList<Long> list = new ArrayList<Long>() {
        public Iterator<Long> iterator() {
            return new Iterator<Long>() {
                int count = 0;
                public boolean hasNext() {
                    return count == 0;
                }
                public Long next() {
                    return get(count++);
                }
            };
        }
    };
    list.add(1L);
    list.add(5L);
    min_subarray_sum(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Long> nums = new ArrayList<>();
nums.add(0L);
nums.add(0L);
min_subarray_sum(nums);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Long> nums = new ArrayList<>();
nums.add(1L);
nums.add(0L);
min_subarray_sum(nums);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Long> list = new ArrayList<>();
list.add(-5L);
list.add(6L);
min_subarray_sum(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Long> list = new ArrayList<>();
list.add(0L);
min_subarray_sum(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Long> list = new ArrayList<>();
list.add(1L);
list.add(1L);
min_subarray_sum(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Long> list = new ArrayList<>();
list.add(1L);
min_subarray_sum(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Long> nums = new ArrayList<>();
nums.add(0L);
nums.add(0L);
min_subarray_sum(nums);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    ArrayList<Long> list = new ArrayList<Long>() {
        @Override
        public Iterator<Long> iterator() {
            return new Iterator<Long>() {
                public boolean hasNext() { return false; }
                public Long next() { return null; }
            };
        }
    };
    list.add(1L);
    list.add(2L);
    list.add(3L);
    min_subarray_sum(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Long> nums = new ArrayList<>();
nums.add(0L);
nums.add(1L);
min_subarray_sum(nums);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Long> nums = new ArrayList<>();
nums.add(1L);
nums.add(0L);
min_subarray_sum(nums);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Long> list = new ArrayList<Long>() {
    @Override
    public Iterator<Long> iterator() {
        return Collections.singletonList(get(0)).iterator();
    }
};
list.add(0L);
list.add(0L);
list.add(0L);
min_subarray_sum(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    ArrayList<Long> nums = new ArrayList<>();
    nums.add(1L);
    nums.add(1L);
    min_subarray_sum(nums);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Long> list = new ArrayList<Long>() {
    @Override
    public Iterator<Long> iterator() {
        return new Iterator<Long>() {
            private int index = 0;
            public boolean hasNext() {
                return index < 1;
            }
            public Long next() {
                if (index < 1) {
                    index++;
                    return get(0);
                }
                throw new NoSuchElementException();
            }
        };
    }
};
list.add(1L);
list.add(2L);
list.add(3L);
min_subarray_sum(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    ArrayList<Long> list = new ArrayList<Long>();
    list.add(-1L);
    list.add(0L);
    min_subarray_sum(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Long> input = new ArrayList<>();
input.add(1L);
input.add(-1L);
min_subarray_sum(input);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    ArrayList<Long> list = new ArrayList<>();
    list.add(-1L);
    list.add(2L);
    min_subarray_sum(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Long> list = new ArrayList<Long>() {
    @Override
    public Iterator<Long> iterator() {
        return new Iterator<Long>() {
            private int index = 0;
            public boolean hasNext() { return index < 1; }
            public Long next() { index++; return get(0); }
        };
    }
};
list.add(0L);
list.add(0L);
min_subarray_sum(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Long> list = new ArrayList<>();
list.add(0L);
list.add(0L);
min_subarray_sum(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Long> list = new ArrayList<>();
list.add(0L);
list.add(1L);
min_subarray_sum(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Long> nums = new ArrayList<>();
nums.add(1L);
nums.add(0L);
min_subarray_sum(nums);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Long> nums = new ArrayList<>();
nums.add(1L);
nums.add(1L);
min_subarray_sum(nums);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    ArrayList<Long> list = new ArrayList<Long>() {
        @Override
        public int size() {
            return 1;
        }
    };
    list.add(0L);
    list.add(0L);
    min_subarray_sum(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    ArrayList<Long> testList = new ArrayList<Long>() {
        @Override public int size() { return 1; }
        @Override public Long get(int index) {
            if(index == 0) return 1L;
            if(index == 1) return 0L;
            throw new IndexOutOfBoundsException();
        }
        @Override public Iterator<Long> iterator() {
            return new Iterator<Long>() {
                int index = 0;
                public boolean hasNext() { return index < 2; }
                public Long next() {
                    if(index == 0) { index++; return 1L; }
                    if(index == 1) { index++; return 0L; }
                    throw new NoSuchElementException();
                }
            };
        }
    };
    min_subarray_sum(testList);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    ArrayList<Long> list = new ArrayList<Long>() {
        @Override
        public int size() {
            return 1;
        }
        @Override
        public Long get(int index) {
            if (index == 0) return 0L;
            throw new IndexOutOfBoundsException();
        }
        @Override
        public Iterator<Long> iterator() {
            return new Iterator<Long>() {
                int cursor = 0;
                public boolean hasNext() {
                    return cursor < 2;
                }
                public Long next() {
                    if (cursor == 0) { cursor++; return 0L; }
                    if (cursor == 1) { cursor++; return 1L; }
                    throw new NoSuchElementException();
                }
            };
        }
    };
    min_subarray_sum(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    
ArrayList<Long> list = new ArrayList<Long>() {
    public int size() {
        return 1;
    }
};
list.add(1L);
list.add(1L);
min_subarray_sum(list);

                    process_coverage();
                }
                catch (Exception e) { }
                
            try {
                FileWriter writer = new FileWriter("min_subarray_sum.txt");
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
