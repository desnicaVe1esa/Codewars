package kyu_7.vowel_count.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class VowelsTest {
    @Test
    public void testCase1() {
        assertEquals("Nope!", 5, Vowels.getCount("abracadabra"));
    }

}
