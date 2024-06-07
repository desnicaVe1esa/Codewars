package kyu_6.make_the_deadfish_swim.java;

import static org.junit.Assert.*;

public class ExampleTests {
    @org.junit.Test
    public void exampleTests() {
        assertArrayEquals(new int[]{8, 64}, DeadFish.parse("iiisdoso"));
        assertArrayEquals(new int[]{8, 64, 3600}, DeadFish.parse("iiisdosodddddiso"));
    }
}