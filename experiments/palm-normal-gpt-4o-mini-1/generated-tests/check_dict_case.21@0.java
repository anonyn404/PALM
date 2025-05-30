```java
public static void main(String args[]) {
    HashMap<Object, Object> dict = new HashMap<>();
    dict.put("KEY1", "value1"); // first key, satisfies assertTrue for hasNext
    dict.put("KEY2", "value2"); // second key for the second iteration
    check_dict_case(dict);
}
```