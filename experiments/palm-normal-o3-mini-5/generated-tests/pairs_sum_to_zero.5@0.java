```java
List<Integer> l = new java.util.AbstractList<Integer>() {
    int cnt = 0;
    @Override
    public int size() {
        if(cnt == 0) { cnt++; return 2; }
        else if(cnt == 1) { cnt++; return 1; }
        else if(cnt == 2) { cnt++; return 2; }
        else { return 2; }
    }
    @Override
    public Integer get(int index) {
        return 0;
    }
};
pairs_sum_to_zero(l);
```