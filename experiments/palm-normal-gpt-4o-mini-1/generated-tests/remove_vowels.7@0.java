```java
public static void main(String args[]) { 
    // Test with a single consonant character
    String result1 = remove_vowels("b"); // Should pass both assertions.
    
    // Test with a string that starts with a consonant
    String result2 = remove_vowels("cde"); // Should pass all assertions.

    // Test with a null string (directly to reach the assertion about length)
    String result3 = remove_vowels(null); // Should reach an assertion failure due to null.
}
```