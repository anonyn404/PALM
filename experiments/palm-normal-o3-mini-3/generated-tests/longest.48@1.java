```java
List<String> custom = new AbstractList<String>() {
    int callCount = 0;
    @Override
    public Iterator<String> iterator() {
        callCount++;
        if(callCount == 1) {
            return new Iterator<String>() {
                boolean hasNext = true;
                @Override
                public boolean hasNext() {
                    return hasNext;
                }
                @Override
                public String next() {
                    if(!hasNext) throw new NoSuchElementException();
                    hasNext = false;
                    return "";
                }
                @Override
                public void remove() {
                    throw new UnsupportedOperationException();
                }
            };
        } else if(callCount == 2) {
            return new Iterator<String>() {
                int index = 0;
                @Override
                public boolean hasNext() {
                    return index < 2;
                }
                @Override
                public String next() {
                    if(index == 0) {
                        index++;
                        return "a";
                    } else if(index == 1) {
                        index++;
                        return "";
                    }
                    throw new NoSuchElementException();
                }
                @Override
                public void remove() {
                    throw new UnsupportedOperationException();
                }
            };
        }
        return Collections.emptyIterator();
    }
    @Override
    public String get(int index) {
        throw new UnsupportedOperationException();
    }
    @Override
    public int size() {
        throw new UnsupportedOperationException();
    }
};
longest(custom);
```