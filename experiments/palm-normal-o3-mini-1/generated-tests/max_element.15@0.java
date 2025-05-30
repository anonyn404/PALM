```java
public static void main(String args[]) { 
    List<Integer> list = new AbstractList<Integer>() {
        public Integer get(int index) {
            if (index == 0) return 1;
            if (index == 1) return 2;
            throw new IndexOutOfBoundsException();
        }
        public int size() {
            return 2;
        }
        public Iterator<Integer> iterator() {
            return new Iterator<Integer>() {
                int count = 0;
                public boolean hasNext() {
                    return count < 2;
                }
                public Integer next() {
                    count++;
                    if (count == 1) return 3;
                    if (count == 2) return 4;
                    throw new NoSuchElementException();
                }
            };
        }
    };
    max_element(list);
}
```