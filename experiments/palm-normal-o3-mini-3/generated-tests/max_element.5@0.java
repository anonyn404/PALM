```java
List<Integer> l = new ArrayList<Integer>() {
    @Override
    public Iterator<Integer> iterator() {
        return Arrays.asList(this.get(1), this.get(0)).iterator();
    }
};
l.add(1);
l.add(2);
max_element(l);
```