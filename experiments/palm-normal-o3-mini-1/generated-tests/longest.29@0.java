```java
public static void main(String args[]) { 
    List<String> list = new AbstractList<String>() {
        int callCount = 0;
        List<String> elems = Arrays.asList("nonempty", "");
        @Override
        public Iterator<String> iterator() {
            callCount++;
            if(callCount == 1) {
                return Collections.emptyIterator();
            } else {
                return elems.iterator();
            }
        }
        @Override
        public String get(int index) {
            return elems.get(index);
        }
        @Override
        public int size() {
            return elems.size();
        }
    };
    longest(list);
}
```