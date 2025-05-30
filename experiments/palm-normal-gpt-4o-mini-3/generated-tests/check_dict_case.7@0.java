```java
public static void main(String args[]) { 
    HashMap<Object, Object> dict = new HashMap<>();
    dict.put(1, "value"); // Adding a non-string key to satisfy the assertions
    check_dict_case(dict); 
}
```