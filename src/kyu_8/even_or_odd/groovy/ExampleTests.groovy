package kyu_8.even_or_odd.groovy;

import static org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.*

class ExampleTests {

    @Test
    void "Should return \"Odd\" for odd positive numbers"() {
        assertEquals("Odd", Even0dd.evenOrOdd(1))
    }

    @Test
    void "Should return \"Even\" for even positive numbers"() {
        assertEquals("Even", Even0dd.evenOrOdd(2))
    }

    @Test
    void "Should return \"Odd\" for odd negative numbers"() {
        assertEquals("Odd", Even0dd.evenOrOdd(-1))
    }

    @Test
    void "Should return \"Even\" for even negative numbers"() {
        assertEquals("Even", Even0dd.evenOrOdd(-2))
    }

    @Test
    void "Should return \"Even\" for zero"() {
        assertEquals("Even", Even0dd.evenOrOdd(0))
    }
}