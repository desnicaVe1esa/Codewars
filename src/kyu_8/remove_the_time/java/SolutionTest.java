package kyu_8.remove_the_time.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void sampleTests() {
        assertEquals("Friday May 2", Solution.shortenToDate("Friday May 2, 9am"), "Failed for input: \"Friday May 2, 9am\"");
        assertEquals("Tuesday January 29", Solution.shortenToDate("Tuesday January 29, 10pm"), "Failed for input: \"Tuesday January 29, 10pm\"");
        assertEquals("Monday December 25", Solution.shortenToDate("Monday December 25, 10pm"), "Failed for input: \"Monday December 25, 10pm\"");
    }
}
