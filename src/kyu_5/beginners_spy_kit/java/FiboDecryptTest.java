package kyu_5.beginners_spy_kit.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FiboDecryptTest {
    @Test
    public void testDecrypt() throws Exception {
        FiboDecrypt fibo = new FiboDecrypt();
        assertEquals("encrypted text = fwutaypuv, password = fibo", "tandy", fibo.decrypt("fwutaypuv", "fibo"));
        assertEquals("encrypted text = mxucyjiijatffk, password = puzzle", "codewars", fibo.decrypt("mxucyjiijatffk", "puzzle"));
    }
}