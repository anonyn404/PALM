```java
HashMap<Object, Object> dict = new HashMap<>();
dict.put("key", "value");
dict.put("another_key", "another_value");
check_dict_case(dict);
dict.put("state", "not_start"); // This will allow state_1 to no longer equal "start"
check_dict_case(dict);
```