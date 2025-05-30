```java
try { 
    string_to_md5("a"); 
} catch (NoSuchAlgorithmException e) { 
    throw new RuntimeException(e); 
}
```