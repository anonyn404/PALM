```java
public static void main(String args[]) { 
    List<Object> values = new ArrayList<Object>(); 
    filter_integers(values); 
    assertFalse(values.iterator().hasNext()); 
}
```