```java
public static void main(String args[]) { 
    List<Integer> list = new AbstractList<Integer>() { 
        List<Integer> backing = Arrays.asList(2, 1);
        @Override 
        public Integer get(int index) { 
            return index == 0 ? 1 : backing.get(index); 
        }
        @Override 
        public int size() { 
            return backing.size(); 
        }
        @Override 
        public Iterator<Integer> iterator() { 
            return backing.iterator(); 
        }
    }; 
    max_element(list); 
}
```