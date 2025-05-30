```java
public static void main(String args[]) {
    ArrayList<Integer> lst1 = new ArrayList<>(Arrays.asList(0)); // assertTrue(i_iter_1.hasNext()), assertFalse((i_1 % 2) == 1)
    ArrayList<Integer> lst2 = new ArrayList<>(Arrays.asList(1)); // assertTrue(i_iter_2.hasNext()), assertFalse((i_2 % 2) == 0)
    exchange(lst1, lst2);
}
```