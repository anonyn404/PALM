```java
List<Double> numbers = new AbstractList<Double>() {
    List<Double> backing = Arrays.asList(0.0, 2.0, 4.0);
    int callCount = 0;
    @Override
    public Double get(int index) {
        return backing.get(index);
    }
    @Override
    public int size() {
        callCount++;
        if(callCount <= 4)
            return 3;
        else
            return 2;
    }
};
double threshold = 1.0;
has_close_elements(numbers, threshold);
```