package kyu_8.tip_calculator.java;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class TipCalculatorTest {

    @Test
    public void test1() {
        assertEquals(Optional.of(2), TipCalculator.calculateTip(30d, "poor"));
    }

    @Test
    public void test2() {
        assertEquals(Optional.of(4), TipCalculator.calculateTip(20d, "Excellent"));
    }

    @Test
    public void test3() {
        assertNull(TipCalculator.calculateTip(20d, "hi"));
    }

    @Test
    public void test4() {
        assertEquals(Optional.of(4), TipCalculator.calculateTip(107.65, "GReat"));
    }
}
