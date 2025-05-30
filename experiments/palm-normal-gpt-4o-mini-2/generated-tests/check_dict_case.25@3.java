```java
public static void main(String args[]) { 
    HashMap<Object, Object> dict = new HashMap<>();
    dict.put("KEY", "value"); // satisfies assertion [5]
    dict.put(1.0, "another value"); // satisfies assertion [7]
    check_dict_case(dict); 
}
```