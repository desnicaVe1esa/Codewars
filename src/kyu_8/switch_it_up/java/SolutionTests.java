package kyu_8.switch_it_up.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTests {
    @Test
    public void basicTests() {
        assertEquals("One", Solution.switchItUp(1));
        assertEquals("Three", Solution.switchItUp(3));
        assertEquals("Five", Solution.switchItUp(5));
    }
}