```java
public static void main(String args[]) {
    List<String> lst1 = new ArrayList<>();
    List<String> lst2 = new ArrayList<>();
    // Construct a string whose length is Integer.MAX_VALUE so that adding 1 gives an overflow to negative.
    char[] huge = new char[Integer.MAX_VALUE];
    Arrays.fill(huge, 'a');
    String s1 = new String(huge); // length = Integer.MAX_VALUE
    lst2.add(s1);
    lst2.add("a"); // length = 1; total = Integer.MAX_VALUE + 1, which overflows to a negative value
    total_match(lst1, lst2);
}
```