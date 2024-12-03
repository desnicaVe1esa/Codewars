package kyu_8.draw_stairs.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    @DisplayName("Sample tests")
    void test3() {
        assertEquals("""
                I
                 I
                  I""", Stairs.draw(3), "Stairs.draw(3)");
    }
}
