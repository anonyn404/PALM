```java
List<Integer> customList = new AbstractList<Integer>() {
    int callCount = 0;
    public int size() {
        callCount++;
        return (callCount <= 3) ? 2 : 1;
    }
    public Integer get(int index) {
        if(index == 0 || index == 1) return 1;
        throw new IndexOutOfBoundsException();
    }
};
pairs_sum_to_zero(customList);
```