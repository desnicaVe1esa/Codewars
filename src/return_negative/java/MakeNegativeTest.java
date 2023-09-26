package return_negative.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MakeNegativeTest {

    @Test
    public void test1() {
        assertEquals(-42, Kata.makeNegative(42));
    }
}
