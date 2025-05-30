```java
public static void main(String args[]) {
    HashMap<Object, Object> map = new HashMap<Object, Object>() {
        @Override
        public int size() {
            return 1;
        }
        @Override
        public Set<Object> keySet() {
            return java.util.Collections.emptySet();
        }
    };
    check_dict_case(map);
}
```