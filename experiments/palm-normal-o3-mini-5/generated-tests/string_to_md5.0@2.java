```java
try {
    string_to_md5("");
} catch (NoSuchAlgorithmException e) {
    throw new RuntimeException(e);
}
```