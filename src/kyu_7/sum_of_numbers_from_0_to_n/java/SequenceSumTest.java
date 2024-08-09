package kyu_7.sum_of_numbers_from_0_to_n.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SequenceSumTest {
    @Test
    public void testBasic() {
        assertEquals("0+1+2+3+4+5+6 = 21",SequenceSum.showSequence(6));
    }
}
