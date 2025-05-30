```java
List<Integer> l = new java.util.AbstractList<Integer>() {
    int count = 0;
    public int size() { 
        count++;
        if(count <= 3) return 3; 
        return 1; 
    }
    public Integer get(int index) {
        return 1;
    }
};
pairs_sum_to_zero(l);
```