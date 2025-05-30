```java
fizz_buzz(1); // 1 > 0 satisfies [1], [2] satisfied by true, (0 + "").length() > 0 satisfies [3], cannot satisfy [4]
fizz_buzz(7); // 7 > 0 satisfies [1], [2] satisfied by true, (0 + "").length() > 0 satisfies [3], (0 + "").substring(0, 1).equals("7") satisfies [4]
```