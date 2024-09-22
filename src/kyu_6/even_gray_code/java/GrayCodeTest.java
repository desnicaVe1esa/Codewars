package kyu_6.even_gray_code.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GrayCodeTest {

    @Test
    public void testSizeTwo() {
        assertEquals("00", GrayCode.evenGrayCode(2, 0));
        assertEquals("11", GrayCode.evenGrayCode(2, 1));
    }

    @Test
    public void testSizeThree() {
        assertEquals("000", GrayCode.evenGrayCode(3, 0));
        assertEquals("011", GrayCode.evenGrayCode(3, 1));
        assertEquals("101", GrayCode.evenGrayCode(3, 2));
        assertEquals("110", GrayCode.evenGrayCode(3, 3));
    }

    @Test
    public void testOtherSizes() {
        assertEquals("1010", GrayCode.evenGrayCode(4, 5));
        assertEquals("10001", GrayCode.evenGrayCode(5, 8));
        assertEquals("0111001101", GrayCode.evenGrayCode(10, 230));
        assertEquals("00000000000000100010", GrayCode.evenGrayCode(20, 17));
    }
}

