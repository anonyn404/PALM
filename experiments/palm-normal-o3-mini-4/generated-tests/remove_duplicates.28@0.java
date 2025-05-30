```java
List<Integer> input = new AbstractList<Integer>() {
    int iterCall = 0;
    @Override
    public Iterator<Integer> iterator() {
        iterCall++;
        if(iterCall == 1) {
            return new Iterator<Integer>() {
                boolean used = false;
                @Override
                public boolean hasNext() {
                    return !used;
                }
                @Override
                public Integer next() {
                    used = true;
                    return 1;
                }
            };
        } else {
            return new Iterator<Integer>() {
                @Override
                public boolean hasNext() {
                    return false;
                }
                @Override
                public Integer next() {
                    throw new NoSuchElementException();
                }
            };
        }
    }
    @Override
    public int size() {
        return 1;
    }
    @Override
    public Integer get(int index) {
        return 1;
    }
};
remove_duplicates(input);
```