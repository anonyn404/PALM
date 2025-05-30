```java
List<Double> list = new ArrayList<Double>(Arrays.asList(1.0, 2.0, 3.0, 4.0)) {
    int count = 0;
    @Override
    public int size() {
        count++;
        return (count == 7) ? 4 : 3;
    }
};
has_close_elements(list, 1.0);
```