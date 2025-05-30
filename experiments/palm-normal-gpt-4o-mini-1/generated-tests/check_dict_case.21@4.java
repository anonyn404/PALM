```java
public static void main(String args[]) {
    HashMap<Object, Object> dict = new HashMap<>();
    dict.put("KEY1", "VALUE1"); // First key, satisfies assertTrue for hasNext and is uppercase
    dict.put("KEY2", "VALUE2"); // Second key, which is also uppercase
    check_dict_case(dict);
}
```