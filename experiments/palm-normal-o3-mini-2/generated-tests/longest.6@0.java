```java
public static void main(String args[]) {
    List<String> s = new java.util.AbstractList<String>() {
        int counter = 0;
        @Override
        public java.util.Iterator<String> iterator() {
            if (counter == 0) {
                counter++;
                return new java.util.Iterator<String>() {
                    @Override
                    public boolean hasNext() {
                        return false;
                    }
                    @Override
                    public String next() {
                        throw new java.util.NoSuchElementException();
                    }
                };
            }
            return new java.util.Iterator<String>() {
                boolean available = true;
                @Override
                public boolean hasNext() {
                    return available;
                }
                @Override
                public String next() {
                    if (available) {
                        available = false;
                        return "a";
                    }
                    throw new java.util.NoSuchElementException();
                }
            };
        }
        @Override
        public String get(int index) {
            return null;
        }
        @Override
        public int size() {
            return 1;
        }
    };
    longest(s);
}
```