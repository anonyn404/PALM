```java
HashMap<Object, Object> dict = new HashMap<Object, Object>() {
    @Override
    public Set<Object> keySet() {
        return new HashSet<Object>();
    }
};
dict.put("key", "value");
check_dict_case(dict);
```