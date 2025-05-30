```java
public static void main(String args[]) {
    List<String> custom = new java.util.AbstractList<String>() {
        int callCount = 0;
        @Override
        public Iterator<String> iterator() {
            if (callCount++ == 0) {
                return new Iterator<String>() {
                    boolean used = false;
                    @Override
                    public boolean hasNext() {
                        return !used;
                    }
                    @Override
                    public String next() {
                        if (!used) {
                            used = true;
                            return "";
                        }
                        throw new java.util.NoSuchElementException();
                    }
                };
            } else {
                return new Iterator<String>() {
                    int count = 0;
                    @Override
                    public boolean hasNext() {
                        return count < 2;
                    }
                    @Override
                    public String next() {
                        if (count < 2) {
                            count++;
                            return "a";
                        }
                        throw new java.util.NoSuchElementException();
                    }
                };
            }
        }
        @Override
        public String get(int index) {
            throw new UnsupportedOperationException();
        }
        @Override
        public int size() {
            return 2;
        }
    };
    longest(custom);
}
```