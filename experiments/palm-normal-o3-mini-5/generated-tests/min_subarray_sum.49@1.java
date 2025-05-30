```java
public static void main(String args[]) { 
    ArrayList<Long> customList = new ArrayList<Long>() {
        @Override 
        public Iterator<Long> iterator(){
            return new Iterator<Long>() {
                int count = 0;
                public boolean hasNext() {
                    return count < 2;
                }
                public Long next() {
                    if(count < 2){
                        count++;
                        return 1L;
                    }
                    throw new NoSuchElementException();
                }
            };
        }
        @Override 
        public int size() {
            return 1;
        }
        @Override 
        public Long get(int index) {
            if(index == 0) return 1L;
            throw new IndexOutOfBoundsException();
        }
    };
    min_subarray_sum(customList); 
}
```