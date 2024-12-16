package kyu_7.digital_cypher.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

class SolutionTest {
    private static Stream<Arguments> sampleData() {
        return Stream.of(
                Arguments.of("scout", 1939, new int[]{20, 12, 18, 30, 21}),
                Arguments.of("masterpiece", 1939, new int[]{14, 10, 22, 29, 6, 27, 19, 18, 6, 12, 8})
        );
    }

    @DisplayName("Sample Tests")
    @ParameterizedTest(name = "message = \"{0}\" , key = {1} ")
    @MethodSource("sampleData")
    void sampleTests(String input, int key, int[] expected) {
        int[] actual = Solution.encode(input, key);
        Assertions.assertArrayEquals(expected, actual,  "Expected array: " + Arrays.toString(expected) + "\nActual array: "+ Arrays.toString(actual) + "\n");
    }
}

