```java
public static void main(String args[]) { 
    HashMap<Object, Object> dict = new HashMap<>();
    dict.put("KEY", "value"); // satisfies assertion [5]
    dict.put("ANOTHER_KEY", 3); // satisfies assertion [7]
    check_dict_case(dict); 
}
```