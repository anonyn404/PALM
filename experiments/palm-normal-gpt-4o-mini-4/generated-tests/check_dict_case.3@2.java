```java
public static void main(String args[]) { 
    HashMap<Object, Object> dict = new HashMap<>(); 
    dict.put("key", "value"); 
    dict.clear(); 
    dict.put("new_key", "new_value");
    check_dict_case(dict); 
}
```