package kyu_7.clean_up_after_your_dog.java;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SampleTests {

    @Test
    void fixedTests() {
        doTest("Clean", new char[][] { { '_','_','_','_' }, { '_','_','_','@' }, { '_','_','@', '_' } }, 2, 2);
        doTest("Cr@p",  new char[][] { { '_','_','_','_' }, { '_','_','_','@' }, { '_','_','@', '_' } }, 1, 1);
        doTest("Dog!!", new char[][] { { '_','_' }, { '_','@' }, { 'D','_' } }, 2, 2);
        doTest("Clean", new char[][] { { '_','_','_','_' }, { '_','_','_','_' }, { '_','_','_', '_' } }, 2, 2);
        doTest("Clean", new char[][] { { '@','@' }, { '@','@' }, { '@','@' } }, 3, 2);
    }

    void doTest(String expected, char[][] garden, int bags, int cap) {
        assertEquals(expected, Kata.crap(garden, bags, cap), String.format("Incorrect answer for garden = %s", Arrays.deepToString(garden)));
    }
}

