package kyu_7.largest_5_digit_number_in_a_series.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestFiveDigitNumberTest {
    @Test
    public void exampleTests() {
        assertEquals(83910, LargestFiveDigitNumber.solve("283910"));
        assertEquals(67890, LargestFiveDigitNumber.solve("1234567890"));
        assertEquals(74765, LargestFiveDigitNumber.solve("731674765"));
    }
}