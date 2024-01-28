package kyu_6.duplicate_encoder.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DuplicateEncoderTest {
    @Test
    public void test() {
        assertEquals(")()())()(()()(", DuplicateEncoder.encode("Prespecialized"));
        assertEquals("))))())))", DuplicateEncoder.encode("   ()(   "));
    }
}