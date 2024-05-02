package kyu_8.do_i_get_a_bonus.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BonusTimeTest {
    @Test
    public void basicTests() {
        boolean wellConfigured = unicodeTest();
        assertEquals((wellConfigured ? "?" : "\u00A3") + "100000", Kata.bonusTime(10000, true));
        assertEquals((wellConfigured ? "?" : "\u00A3") + "250000", Kata.bonusTime(25000, true));
        assertEquals((wellConfigured ? "?" : "\u00A3") + "10000", Kata.bonusTime(10000, false));
        assertEquals((wellConfigured ? "?" : "\u00A3") + "60000", Kata.bonusTime(60000, false));
    }

    public boolean unicodeTest() {
        System.out.println("\u00A3 == ?:" + "\u00A3".equalsIgnoreCase("?"));
        System.out.println("if previous result was false or had ? symbol then perhaps you need to escape unicode due to misconfiguration");
        return "\u00A3".equalsIgnoreCase("?");
    }
}