```java
public static void main(String args[]) {
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
}
```