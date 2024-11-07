package kyu_6.minimum_difference_in_duplicate_characters.java;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

class Fixed_tests {
    @Test
    void basicTest_1() {
        assertArrayEquals(new Object[]{1, "a"}, Kata.minRepeatingCharacterDifference("aabbca"));
    }

    @Test
    void basicTest_2() {
        assertArrayEquals(new Object[]{2, "d"}, Kata.minRepeatingCharacterDifference("abded"));
    }

    @Test
    void basicTest_3() {
        assertArrayEquals(new Object[]{1, "b"}, Kata.minRepeatingCharacterDifference("abbbbbc"));
    }

    @Test
    void basicTest_4() {
        assertArrayEquals(new Object[]{1, "a"}, Kata.minRepeatingCharacterDifference("aa"));
    }

    @Test
    void basicTest_5() {
        assertArrayEquals(new Object[]{2, "a"}, Kata.minRepeatingCharacterDifference("aba"));
    }

    @Test
    void basicTest_6() {
        assertArrayEquals(null, Kata.minRepeatingCharacterDifference("abcde"));
    }

    @Test
    void basicTest_7() {
        assertArrayEquals(null, Kata.minRepeatingCharacterDifference("qwerty"));
    }

}
