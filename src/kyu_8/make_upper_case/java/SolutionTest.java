package kyu_8.make_upper_case.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Upper u = new Upper();

    @Test
    public void testSomething() {
        assertEquals("HELLO",u.MakeUpperCase("hello"));
    }
}
