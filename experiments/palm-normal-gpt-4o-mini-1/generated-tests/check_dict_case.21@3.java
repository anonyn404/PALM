```java
public static void main(String args[]) {
    HashMap<Object, Object> dict = new HashMap<>();
    dict.put("KEY1", "value1"); // First key, satisfies assertTrue for hasNext
    dict.put("KEY2", "KEY2"); // Second key, which is also uppercase
    check_dict_case(dict);
}
```