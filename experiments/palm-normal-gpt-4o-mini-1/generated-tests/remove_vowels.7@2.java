```java
public static void main(String args[]) { 
    // Test with a single consonant character
    String result1 = remove_vowels("b"); // Should pass both assertions.

    // Test with a string that has non-vowel characters
    String result2 = remove_vowels("bcdfg"); // Should pass all assertions.

    // Test with a string starting with a consonant and followed by a vowel
    String result3 = remove_vowels("bace"); // Should pass all assertions.
}
```