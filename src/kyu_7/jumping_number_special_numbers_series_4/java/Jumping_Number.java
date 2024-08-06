package kyu_7.jumping_number_special_numbers_series_4.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Jumping_Number {
    @Test
    public void Single_Digit_Number() {
        assertEquals("Jumping!!", Solution.jumpingNumber(9));
        assertEquals("Jumping!!", Solution.jumpingNumber(1));
        assertEquals("Jumping!!", Solution.jumpingNumber(7));
    }

    @Test
    public void Two_Digit_Number() {
        assertEquals("Jumping!!", Solution.jumpingNumber(23));
        assertEquals("Jumping!!", Solution.jumpingNumber(32));
        assertEquals("Not!!", Solution.jumpingNumber(79));
        assertEquals("Jumping!!", Solution.jumpingNumber(98));
    }

    @Test
    public void Larger_Numbers() {
        assertEquals("Jumping!!", Solution.jumpingNumber(8987));
        assertEquals("Jumping!!", Solution.jumpingNumber(4343456));
        assertEquals("Jumping!!", Solution.jumpingNumber(98789876));
    }
}
