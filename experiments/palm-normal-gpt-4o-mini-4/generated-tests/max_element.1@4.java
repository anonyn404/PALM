```java
List<Integer> l = new ArrayList<>(); 
l.add(1); 
l.add(2); 
l.add(3); 
Iterator<Integer> e_iter_1 = l.iterator();
e_iter_1.next(); // Move to the first element
e_iter_1.remove(); // Remove it to satisfy the assertFalse
max_element(l);
```