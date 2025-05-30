```java
List<Integer> base = Arrays.asList(2, 1);
List<Integer> l = new ArrayList<>(base) {
    public Integer get(int index) {
        if (index == 0) return 1;
        return super.get(index);
    }
};
max_element(l);
```