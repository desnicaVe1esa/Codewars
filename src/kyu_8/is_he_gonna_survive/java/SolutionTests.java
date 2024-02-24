package kyu_8.is_he_gonna_survive.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTests {
    @Test @DisplayName("A true hero")
    void aTrueHero() {
        assertTrue(Solution.hero(10, 5), "With 10 bullets and 5 dragons");
        assertTrue(Solution.hero(100, 40), "With 100 bullets and 40 dragons");
    }

    @Test @DisplayName("A false hero")
    void aFalseHero() {
        assertFalse(Solution.hero(4, 5), "With 4 bullets and 5 dragons");
        assertFalse(Solution.hero(1500, 751), "With 1500 bullets and 751 dragons");
        assertFalse(Solution.hero(0, 1), "With 0 bullets and 1 dragon");
        assertFalse(Solution.hero(7, 4), "With 7 bullets and 4 dragons");
    }
}