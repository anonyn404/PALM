```java
public static void main(String args[]) { 
    List<String> testList = new ArrayList<>();
    testList.add(""); // string_1 will be ""
    longest(testList);
    testList = Collections.emptyList(); // Now string_iter_2 has no elements
    longest(testList);
}
```