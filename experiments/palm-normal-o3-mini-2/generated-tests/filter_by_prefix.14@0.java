```java
public static void main(String[] args) {
    List<String> testList = new ArrayList<>();
    testList.add("prefix_match");
    testList.add("no_match");
    filter_by_prefix(testList, "prefix");
}
```