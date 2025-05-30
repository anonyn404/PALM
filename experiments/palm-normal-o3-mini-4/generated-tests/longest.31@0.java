```java
public static void main(String args[]) { 
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
}
```