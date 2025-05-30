```java
public static void main(String args[]) { 
    System.out.println(check_if_last_char_is_a_letter("A")); // assertTrue
    System.out.println(check_if_last_char_is_a_letter("B")); // assertTrue
    System.out.println(check_if_last_char_is_a_letter("word ")); // assertFalse
    System.out.println(check_if_last_char_is_a_letter(" ")); // assertFalse
    System.out.println(check_if_last_char_is_a_letter("")); // assertFalse
    System.out.println(check_if_last_char_is_a_letter(null)); // assertFalse
}
```