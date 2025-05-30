```java
public static void main(String args[]) {
    List<Integer> tricky = new java.util.AbstractList<Integer>() {
        int callCount = 0;
        java.util.List<Integer> backing = java.util.Arrays.asList(10, 20, 30, 5);
        @Override
        public Integer get(int index) {
            return backing.get(index);
        }
        @Override
        public int size() {
            callCount++;
            if(callCount == 5) {
                return 1;
            }
            return 4;
        }
    };
    sort_third(tricky);
}
```