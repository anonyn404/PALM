```java
public static void main(String args[]) {
    List<String> lst1 = new ArrayList<>();
    List<String> lst2 = new ArrayList<>();
    lst2.add("A".repeat(2147483647));
    lst2.add("B".repeat(2147483647));
    total_match(lst1, lst2);
}
```