```java
public static void main(String args[]) { 
    HashMap<Object, Object> dict = new HashMap<>();
    dict.put("FIRST", 1); // This will satisfy assertTrue(str_key_1.toUpperCase().equals(str_key_1)); 
    dict.put("SECOND", 2); // This will also satisfy assertTrue(str_key_1.toUpperCase().equals(str_key_1));
    dict.put(3, "value"); // This will satisfy assertTrue(!(key_1 instanceof String)); 
    check_dict_case(dict); 
}
```