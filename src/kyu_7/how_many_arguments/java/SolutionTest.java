package kyu_7.how_many_arguments.java;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void sampleTest() {
        assertEquals(3, Arguments.countArgs(1, 2, 3));
        assertEquals(3, Arguments.countArgs(1, 2, "uhsaf uas"));
        assertEquals(1, Arguments.countArgs(1));
        assertEquals(4, Arguments.countArgs('a', 865, "asfhgajsf", new BigInteger("123456")));
        assertEquals(0, Arguments.countArgs());
    }
}
