```java
public static void main(String args[]) { 
    try {
        // Test with a non-empty string input
        String result = string_to_md5("test");
        assertTrue(result != null && !result.equals("")); // Should not be empty
    } catch (NoSuchAlgorithmException e) {
        // Handle exception
    }
}
```