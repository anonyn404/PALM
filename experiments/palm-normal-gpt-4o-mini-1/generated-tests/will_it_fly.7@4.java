```java
public static void main(String args[]) { 
    int[] q = {1, 2}; // Length is 2, satisfies assertFalse(0 < q.length)
    int w = -1; // w is not > 0, satisfies assertFalse(0 > w)
    will_it_fly(q, w); 
}
```