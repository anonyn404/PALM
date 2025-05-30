```java
List<Integer> l = new ArrayList<Integer>(Arrays.asList(2, 3)) {
    @Override
    public Integer get(int index) {
        return index == 0 ? 1 : super.get(index);
    }
};
max_element(l);
```