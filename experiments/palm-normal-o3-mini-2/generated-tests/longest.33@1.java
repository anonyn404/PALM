```java
public static void main(String args[]) {
    List<String> customList = new AbstractList<String>() {
        int iterCalls = 0;
        @Override
        public Iterator<String> iterator() {
            if (iterCalls == 0) {
                iterCalls++;
                return new Iterator<String>() {
                    int count = 0;
                    public boolean hasNext() {
                        return count < 2;
                    }
                    public String next() {
                        if (count < 2) {
                            count++;
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
        @Override
        public String get(int index) {
            return "";
        }
        @Override
        public int size() {
            return iterCalls == 0 ? 2 : 0;
        }
    };
    longest(customList);
}
```