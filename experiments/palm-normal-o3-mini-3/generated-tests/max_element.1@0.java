```java
public static void main(String args[]) { 
    List<Integer> l = new AbstractList<Integer>() {
        public Integer get(int index) { 
            return 42; 
        }
        public int size() { 
            return 1; 
        }
        public Iterator<Integer> iterator() {
            return new Iterator<Integer>() {
                public boolean hasNext() { 
                    return false; 
                }
                public Integer next() { 
                    return null; 
                }
            };
        }
    };
    max_element(l);
}
```