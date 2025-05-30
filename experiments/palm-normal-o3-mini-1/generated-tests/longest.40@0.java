```java
List<String> list = new ArrayList<String>() {
    private boolean firstIterator = true;
    @Override
    public Iterator<String> iterator() {
        if (firstIterator) {
            firstIterator = false;
            return new Iterator<String>() {
                private int index = 0;
                @Override
                public boolean hasNext() {
                    return index < 2;
                }
                @Override
                public String next() {
                    if (index == 0) {
                        index++;
                        return "";
                    } else if (index == 1) {
                        index++;
                        return "a";
                    }
                    throw new NoSuchElementException();
                }
            };
        } else {
            return new Iterator<String>() {
                @Override
                public boolean hasNext() {
                    return false;
                }
                @Override
                public String next() {
                    throw new NoSuchElementException();
                }
            };
        }
    }
};
longest(list);
```