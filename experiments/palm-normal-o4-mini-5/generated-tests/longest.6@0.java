java.util.List<String> strings = new java.util.AbstractList<String>() {
    private boolean first = true;
    public java.util.Iterator<String> iterator() {
        if (first) {
            first = false;
            return java.util.Collections.<String>emptyList().iterator();
        } else {
            return java.util.Collections.singletonList("a").iterator();
        }
    }
    public String get(int index) { return "a"; }
    public int size() { return 1; }
};
longest(strings);