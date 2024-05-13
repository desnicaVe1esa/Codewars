package kyu_7.simple_fun_number_74_growing_plant.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SampleTest {
    @Test
    public void basicTests() {
        doTest(100, 10, 910, 10);
        doTest( 10,  9,   4,  1);
    }
    private void doTest(int upSpeed, int downSpeed, int desiredHeight, int expected) {
        assertEquals(expected, SimpleFun.growingPlant(upSpeed, downSpeed, desiredHeight));
    }
}