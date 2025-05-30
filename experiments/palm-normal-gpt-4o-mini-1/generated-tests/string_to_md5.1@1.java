```java
public static void main(String args[]) { 
    // Test with a valid non-empty string input
    assertTrue(string_to_md5("HelloWorld").length() == 32);
    // Test with another valid non-empty string input
    assertTrue(string_to_md5("12345").length() == 32);
}
```