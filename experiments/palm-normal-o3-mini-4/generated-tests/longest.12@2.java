```java
public static void main(String args[]) {
    List<String> list = new AbstractList<String>() {
        int callCount = 0;
        @Override
        public Iterator<String> iterator() {
            callCount++;
            if (callCount == 1) {
                return Collections.emptyIterator();
            } else {
                return Collections.singletonIterator("nonEmpty");
            }
        }
        @Override
        public String get(int index) {
            return "nonEmpty";
        }
        @Override
        public int size() {
            return 1;
        }
    };
    longest(list);
}
```