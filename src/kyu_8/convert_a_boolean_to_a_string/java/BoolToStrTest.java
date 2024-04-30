package kyu_8.convert_a_boolean_to_a_string.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BoolToStrTest {
    @Test
    void testTrue() {
        assertEquals("true", BooleanToString.convert(true));
    }

    @Test
    void testFalse() {
        assertEquals("false", BooleanToString.convert(false));
    }
}