```java
int[] l1 = new int[1]; // non-empty array
int[] l2 = new int[0]; // empty array
HashSet<Integer> common_1 = new HashSet<Integer>();
common_1.add(1); // adding an element to ensure iterator hasNext() is true
common(l1, l2);
```