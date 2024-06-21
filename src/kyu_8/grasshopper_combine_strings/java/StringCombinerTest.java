package kyu_8.grasshopper_combine_strings.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCombinerTest {

    @Test
    void test() {
        assertEquals("James Stevens",
                StringCombiner.combineNames("James","Stevens"));
    }
}
