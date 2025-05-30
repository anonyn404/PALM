```java
public static void main(String args[]) {
    List<String> list = new AbstractList<String>() {
        int callCount = 0;
        @Override
        public Iterator<String> iterator() {
            if (callCount == 0) {
                callCount++;
                return new Iterator<String>() {
                    int count = 0;
                    @Override
                    public boolean hasNext() {
                        return count < 2;
                    }
                    @Override
                    public String next() {
                        if (count < 2) {
                            return "";
                        }
                        throw new NoSuchElementException();
                    }
                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            } else {
                callCount++;
                return new Iterator<String>() {
                    boolean done = false;
                    @Override
                    public boolean hasNext() {
                        return !done;
                    }
                    @Override
                    public String next() {
                        if (!done) {
                            done = true;
                            return "a";
                        }
                        throw new NoSuchElementException();
                    }
                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        }
        @Override
        public int size() {
            return 2;
        }
        @Override
        public String get(int index) {
            throw new UnsupportedOperationException();
        }
    };
    longest(list);
}
```