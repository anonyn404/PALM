```java
public static void main(String args[]) { 
    // Test with an empty string
    String result1 = remove_vowels(""); // Should pass assertion [1] and [2].

    // Test with a single consonant character
    String result2 = remove_vowels("b"); // Should pass all assertions.

    // Test with a string that starts with a consonant
    String result3 = remove_vowels("cde"); // Should pass all assertions.
}
```