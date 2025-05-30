```java
HashMap<Object, Object> map = new HashMap<Object, Object>() {
    @Override
    public int size() {
        return 1;
    }
    @Override
    public Set<Object> keySet() {
        return new HashSet<>();
    }
};
check_dict_case(map);
```