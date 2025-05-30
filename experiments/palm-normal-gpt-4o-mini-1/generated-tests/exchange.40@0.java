```java
public static void main(String args[]) {
    ArrayList<Integer> lst1 = new ArrayList<>(); // Empty list to satisfy assertFalse
    ArrayList<Integer> lst2 = new ArrayList<>(Arrays.asList(2, 3)); // Contains an even number first
    exchange(lst1, lst2);
}
```