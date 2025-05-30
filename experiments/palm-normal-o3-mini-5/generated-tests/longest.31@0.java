```java
List<String> customList = new java.util.AbstractList<String>() {
    int callCount = 0;
    public int size() { return 1; }
    public String get(int index) { return "aaa"; }
    public java.util.Iterator<String> iterator() {
        callCount++;
        if(callCount == 1) {
            return java.util.Collections.singletonList("aaa").iterator();
        } else {
            return java.util.Collections.singletonList("bb").iterator();
        }
    }
};
longest(customList);
```