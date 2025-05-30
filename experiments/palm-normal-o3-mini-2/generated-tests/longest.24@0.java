```java
public static void main(String args[]) {
    List<String> custom = new ArrayList<String>() {
        boolean firstCall = true;
        @Override
        public Iterator<String> iterator() {
            if (firstCall) {
                firstCall = false;
                return new Iterator<String>() {
                    boolean hasNext = true;
                    @Override
                    public boolean hasNext() {
                        return hasNext;
                    }
                    @Override
                    public String next() {
                        if (hasNext) {
                            hasNext = false;
                            return "abc";
                        }
                        throw new NoSuchElementException();
                    }
                };
            } else {
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
            }
        }
    };
    longest(custom);
}
```