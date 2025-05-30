```java
public static void main(String args[]) { 
    HashMap<Object, Object> dict = new HashMap<>();
    dict.put("KEY", "value"); // meets condition for assertTrue at [5]
    dict.put(2.5, "another value"); // meets condition for assertTrue at [7]
    check_dict_case(dict); 
}
```