```java
public static void main(String args[]) {
    List<Integer> customList = new AbstractList<Integer>() {
        int callCount = 0;
        public Iterator<Integer> iterator() {
            callCount++;
            if (callCount == 1) {
                return new Iterator<Integer>() {
                    boolean hasNext = true;
                    public boolean hasNext() {
                        return hasNext;
                    }
                    public Integer next() {
                        if (hasNext) {
                            hasNext = false;
                            return 1;
                        }
                        throw new NoSuchElementException();
                    }
                };
            } else if (callCount == 2) {
                return new Iterator<Integer>() {
                    int index = 0;
                    public boolean hasNext() {
                        return index < 2;
                    }
                    public Integer next() {
                        if (index < 2) {
                            return index++ == 0 ? 1 : 2;
                        }
                        throw new NoSuchElementException();
                    }
                };
            } else {
                return Collections.emptyIterator();
            }
        }
        public int size() {
            return 2;
        }
        public Integer get(int index) {
            return index == 0 ? 1 : 2;
        }
    };
    remove_duplicates(customList);
}
```