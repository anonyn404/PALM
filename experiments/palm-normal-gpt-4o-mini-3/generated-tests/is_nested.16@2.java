```java
public static void main(String args[]) { 
    assert !is_nested(""); 
    assert !is_nested(null);
    assert !is_nested("()"); 
    assert !is_nested(")("); 
    assert !is_nested(")(");
}
```