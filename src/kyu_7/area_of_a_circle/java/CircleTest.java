package kyu_7.area_of_a_circle.java;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CircleTest {

    @Test @Order(1)
    public void testOne() {
        assertEquals(3.141, Circle.area(1), 0.01);
    }

    @Test @Order(2)
    public void testExamples() {
        assertEquals( 5881.248, Circle.area(43.2673), 0.01);
        assertEquals(14526.724, Circle.area(68     ), 0.01);
    }

    @Test @Order(3)
    public void testZero() {
        assertThrows(IllegalArgumentException.class, () -> Circle.area(0));
    }

    @Test @Order(4)
    public void testNegative() {
        assertThrows(IllegalArgumentException.class, () -> Circle.area(-1.0));
    }
}
