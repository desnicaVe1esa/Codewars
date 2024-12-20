package kyu_5.int32_to_ipv4.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTest {
    @Test
    public void sampleTest() {
        assertEquals("128.114.17.104", Kata.longToIP(2154959208L));
        assertEquals("0.0.0.0", Kata.longToIP(0));
        assertEquals("128.32.10.1", Kata.longToIP(2149583361L));
    }
}

