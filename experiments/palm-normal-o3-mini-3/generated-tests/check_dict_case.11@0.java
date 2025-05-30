```java
LinkedHashMap<Object, Object> dict = new LinkedHashMap<>();
dict.put("ABC", new Object());
dict.put(new Object(), new Object());
check_dict_case(dict);
```