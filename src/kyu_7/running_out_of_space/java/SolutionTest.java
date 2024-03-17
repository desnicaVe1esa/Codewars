package kyu_7.running_out_of_space.java;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SolutionTest {
    @Test
    @Order(1)
    @DisplayName("Strings with lower letters only")
    void test1() {
        String[] input = new String[]{"kevin", "has", "no", "space"};
        String[] expected = new String[]{"kevin", "kevinhas", "kevinhasno", "kevinhasnospace"};
        Assertions.assertArrayEquals(expected, OutOfSpace.spacey(input));
    }

    @Order(2)
    @DisplayName("Strings with camel case")
    void test2() {
        String[] input = new String[]{"Camel", "Case", "Should", "Remain"};
        String[] expected = new String[]{"Camel", "CamelCase", "CamelCaseShould", "CamelCaseShouldRemain"};
        Assertions.assertArrayEquals(expected, OutOfSpace.spacey(input));
    }
}