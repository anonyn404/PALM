List<Double> numbers = new java.util.AbstractList<Double>() {
    private int call = 0;
    public java.util.Iterator<Double> iterator() {
        call++;
        if (call == 1) return java.util.Collections.<Double>emptyIterator();
        else return java.util.Arrays.<Double>asList(1.0, 2.0).iterator();
    }
    public Double get(int index) { throw new IndexOutOfBoundsException(); }
    public int size() { return 2; }
};
mean_absolute_deviation(numbers);