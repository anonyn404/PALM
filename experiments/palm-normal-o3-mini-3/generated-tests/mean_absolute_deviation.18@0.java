```java
List<Double> customList = new AbstractList<Double>() {
    int callCount = 0;
    @Override
    public Iterator<Double> iterator() {
        callCount++;
        if(callCount == 1) {
            return Collections.singletonList(1.0).iterator();
        } else if(callCount == 2) {
            return Arrays.asList(2.0, 4.0).iterator();
        }
        return super.iterator();
    }
    @Override
    public int size() {
        return 2;
    }
    @Override
    public Double get(int index) {
        if(index == 0) return 1.0;
        if(index == 1) return 4.0;
        throw new IndexOutOfBoundsException();
    }
};

mean_absolute_deviation(customList);
```