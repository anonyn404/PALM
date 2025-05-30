```java
main(new String[]{null}); // Edge case: null input
main(new String[]{" "}); // Edge case: single space
main(new String[]{""}); // Edge case: empty string
main(new String[]{"abc "}); // Normal case: last character is a space
main(new String[]{"abc z"}); // Normal case: last character is a letter
```