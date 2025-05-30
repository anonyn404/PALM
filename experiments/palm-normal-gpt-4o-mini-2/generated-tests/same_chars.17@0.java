```java
        System.out.println(same_chars("ab", "ab")); // should return true
        System.out.println(same_chars("ab", "ba")); // should return true
        System.out.println(same_chars("a", "a"));   // should return true
        System.out.println(same_chars("a", "b"));   // should return false
        System.out.println(same_chars("", ""));      // should return true
        System.out.println(same_chars(null, null));  // should throw NullPointerException
        System.out.println(same_chars("a", null));   // should throw NullPointerException
        System.out.println(same_chars(null, "b"));   // should throw NullPointerException
```