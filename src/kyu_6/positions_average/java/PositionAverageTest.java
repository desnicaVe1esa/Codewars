package kyu_6.positions_average.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PositionAverageTest {

    private static void assertFuzzy(String s, double exp){
        System.out.println("Testing " + s);
        boolean inrange;
        double merr = 1e-9;
        double actual = PositionAverage.posAverage(s);
        inrange = Math.abs(actual - exp) <= merr;
        if (inrange == false) {
            System.out.println("Expected mean must be near " + exp +", got " + actual);
        }
        assertEquals(true, inrange);
    }
    @Test
    public void test() {
        assertFuzzy("6900690040, 4690606946, 9990494604", 26.66666666666667);
        assertFuzzy("466960, 069060, 494940, 060069, 060090, 640009, 496464, 606900, 004000, 944096", 26.6666666667);
        assertFuzzy("444996, 699990, 666690, 096904, 600644, 640646, 606469, 409694, 666094, 606490", 29.2592592593);
        assertFuzzy("4444444, 4444444, 4444444, 4444444, 4444444, 4444444, 4444444, 4444444", 100);
        assertFuzzy("0, 0, 0, 0, 0, 0, 0, 0", 100);
    }
}

