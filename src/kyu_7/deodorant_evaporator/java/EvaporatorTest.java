package kyu_7.deodorant_evaporator.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvaporatorTest {
    @Test
    public void testEvaporatorOne() {
        assertEquals(22 , Evaporator.evaporator(10, 10, 10));
    }
}