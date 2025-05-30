```java
public static void main(String args[]) {
    List<String> list = new AbstractList<String>() {
        int count = 0;
        public Iterator<String> iterator() {
            count++;
            if (count == 1) {
                return Collections.emptyIterator();
            } else {
                return Collections.singletonIterator("a");
            }
        }
        public String get(int index) {
            return "a";
        }
        public int size() {
            return 1;
        }
    };
    longest(list);
}
```