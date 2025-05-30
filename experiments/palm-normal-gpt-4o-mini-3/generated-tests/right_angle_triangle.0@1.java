```java
        assertTrue(right_angle_triangle(3, 4, 5));
        assertTrue(right_angle_triangle(5, 12, 13));
        assertTrue(right_angle_triangle(8, 15, 17));
        assertFalse(right_angle_triangle(1, 2, 3));
        assertFalse(right_angle_triangle(1, 1, 1));
        assertTrue(right_angle_triangle(0, 0, 0)); // Assuming zero-length sides can form a trivial right-angle triangle
        assertFalse(right_angle_triangle(1, 1, 0)); // Non-triangle with one side as 0
```