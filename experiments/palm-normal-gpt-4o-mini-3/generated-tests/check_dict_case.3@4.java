```java
public static void main(String args[]) { 
    HashMap<Object, Object> dict = new HashMap<>(); 
    dict.put("key", "value"); 
    Iterator<Object> key_iter_1 = dict.keySet().iterator(); 
    key_iter_1.next(); // ensures hasNext() returns false next time
    dict.clear(); 
    check_dict_case(dict); 
}
```