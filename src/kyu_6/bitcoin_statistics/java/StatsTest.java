package kyu_6.bitcoin_statistics.java;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class StatsTest {
    @Test
    public void testGetMinAvgMax() {
        int discard = 2;
        double[][] data = {{800,1200,2100,4100,1300,700}, {1000,1500,4500,5000,5800,2000,1500}};
        double[][] expect = {{2100,3100,4100}, {4500,5100,5800}, {2100,4300,5800}};
        double[][] actual = Stats.getMinAvgMax(discard , data);
        assertArrayEquals(expect, actual);
    }
}

