```java
    HashMap<Object, Object> dict = new HashMap<>();
    dict.put("KEY", "value"); // satisfies assertion [5]
    dict.put(100, "another value"); // satisfies assertion [7]
    check_dict_case(dict);
```