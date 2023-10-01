package moduli_number_system.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import java.util.stream.Stream;

class ModSystemTest {

    @DisplayName("Sample tests")
    @ParameterizedTest(name = "n: {0}, sys: {1}, expected: \"{2}\"")
    @MethodSource
    void sampleTests(int n, int[] sys, String expected) {
        assertEquals(expected, ModSystem.fromNb2Str(n, sys));
    }

    static Stream<Arguments> sampleTests() {
        return Stream.of(arguments(187, new int[] {8, 7, 5, 3}, "-3--5--2--1-"),
                arguments(779, new int[] {8, 7, 5, 3}, "-3--2--4--2-"),
                arguments(3450, new int[] {13,11,7,5,3,2}, "-5--7--6--0--0--0-"));
    }

    @DisplayName("Not pairwise coprime")
    @Test
    void notPairwiseCoprime(){
        assertEquals("Not applicable", ModSystem.fromNb2Str(15, new int[]{8,6,5,3}), "moduli 8 and 6 are not coprime");
    }

    @DisplayName("n too big")
    @Test
    void nTooBig(){
        assertEquals("Not applicable", ModSystem.fromNb2Str(3450, new int[]{17,5,3}), "3450 is greater than product of moduli (255)");
    }
}