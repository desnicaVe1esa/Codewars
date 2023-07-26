package isograms;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTests {
    @Test
    public void FixedTests() {
        assertTrue(Solution.isIsogram("Dermatoglyphics"));
        assertTrue(Solution.isIsogram("isogram"));
        assertFalse(Solution.isIsogram("moose"));
        assertFalse(Solution.isIsogram("isIsogram"));
        assertFalse(Solution.isIsogram("aba"));
        assertFalse(Solution.isIsogram("moOse"));
        assertTrue(Solution.isIsogram("thumbscrewjapingly"));
        assertTrue(Solution.isIsogram(""));
    }
}
