```java
public static void main(String args[]) {
    List<String> lst1 = new ArrayList<>();
    List<String> lst2 = new ArrayList<>();
    String s1 = new String(new char[Integer.MAX_VALUE]); // length = 2147483647
    String s2 = "a"; // length = 1, so 2147483647 + 1 overflows to -2147483648
    lst2.add(s1);
    lst2.add(s2);
    total_match(lst1, lst2);
}
```