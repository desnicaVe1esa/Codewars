package kyu_7.a_man_and_his_earthly_measurement.java;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    private Eratosthenes SM;

    @Before
    public void Init() {
        SM = new Eratosthenes();

    }

    @Test
    public void EarthTest() {
        double circ = SM.circumference(8.1, 1.0, 800);
        assertEquals(40075.00, circ, circ * 0.05);
    }

    @Test
    public void Test1() {
        double circ = SM.circumference(1, 5, 20);
        assertEquals(91.0, circ, circ * 0.05);
    }

    @Test
    public void Test2() {
        double circ = SM.circumference(2, 5, 50);
        assertEquals(264.0, circ, circ * 0.05);
    }
}