```java
public static void main(String args[]) {
    List<Integer> custom = new java.util.AbstractList<Integer>() {
        private int iteratorCount = 0;
        @Override
        public java.util.Iterator<Integer> iterator() {
            iteratorCount++;
            if (iteratorCount == 1) {
                return java.util.Collections.singletonList(1).iterator();
            } else {
                java.util.List<Integer> list = new java.util.ArrayList<>();
                list.add(1);
                list.add(2);
                return list.iterator();
            }
        }
        @Override
        public Integer get(int index) {
            if (index == 0) return 1;
            if (index == 1) return 2;
            throw new IndexOutOfBoundsException();
        }
        @Override
        public int size() {
            return 2;
        }
    };
    remove_duplicates(custom);
}
```