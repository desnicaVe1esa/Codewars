package kyu_7.alternate_capitalization.java;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void basicTests() {
        assertArrayEquals(new String[]{"AbCdEf", "aBcDeF"}, Solution.capitalize("abcdef"));
        assertArrayEquals(new String[]{"CoDeWaRs", "cOdEwArS"}, Solution.capitalize("codewars"));
        assertArrayEquals(new String[]{"AbRaCaDaBrA", "aBrAcAdAbRa"}, Solution.capitalize("abracadabra"));
        assertArrayEquals(new String[]{"CoDeWaRrIoRs", "cOdEwArRiOrS"}, Solution.capitalize("codewarriors"));
    }
}