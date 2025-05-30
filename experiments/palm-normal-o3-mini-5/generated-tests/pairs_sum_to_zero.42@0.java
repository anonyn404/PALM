```java
List<Integer> list = new AbstractList<Integer>() {
    int callCount = 0;
    public int size() {
        callCount++;
        if(callCount <= 3)
            return 4;
        else if(callCount == 4)
            return 3;
        else
            return 2;
    }
    public Integer get(int index) {
        return 1;
    }
};
pairs_sum_to_zero(list);
```