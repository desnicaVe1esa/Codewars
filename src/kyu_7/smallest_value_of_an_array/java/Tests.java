package kyu_7.smallest_value_of_an_array.java;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
    private static void doTest(int[] numbers, String mode, int expected) {
        String message = String.format("for mode = \"%s\" and array = %s\n",
                mode, Arrays.toString(numbers)
        );
        int actual = Codewars.findSmallest(numbers, mode);
        assertEquals(expected, actual, message);
    }

    @Test
    void sampleTests() {
        doTest(new int[] {1, 2, 3, 4, 5}, "value", 1);
        doTest(new int[] {1, 2, 3, 4, 5}, "index", 0);
        doTest(new int[] {5, 4, 3, 2, 1}, "value", 1);
        doTest(new int[] {5, 4, 3, 2, 1}, "index", 4);
        doTest(new int[] {Integer.MAX_VALUE}, "value", Integer.MAX_VALUE);
        doTest(new int[] {0, Integer.MIN_VALUE}, "value", Integer.MIN_VALUE);
    }
}
