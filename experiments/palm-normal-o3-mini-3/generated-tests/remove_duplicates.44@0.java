```java
List<Integer> customList = new ArrayList<Integer>() {
    private int iteratorCalls = 0;
    @Override
    public Iterator<Integer> iterator() {
        iteratorCalls++;
        if (iteratorCalls == 1) {
            return Collections.singletonList(get(0)).iterator();
        } else {
            return super.iterator();
        }
    }
};
customList.add(1);
customList.add(2);
remove_duplicates(customList);
```