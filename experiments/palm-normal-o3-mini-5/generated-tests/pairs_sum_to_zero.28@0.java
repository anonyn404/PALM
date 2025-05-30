```java
List<Integer> l = new ArrayList<Integer>(Arrays.asList(1,1,1)) {
    int callCount = 0;
    @Override
    public int size() {
        callCount++;
        if(callCount == 1 || callCount == 2 || callCount == 3 || callCount == 4) return 3;
        if(callCount == 5) return 1;
        return 1;
    }
};
pairs_sum_to_zero(l);
```