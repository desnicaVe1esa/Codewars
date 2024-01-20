package kyu_8.keep_up_the_hoop.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HoopCountTest {
    @Test
    public void testHoopCount(){
        assertEquals("Great, now move on to tricks", HelpAlex.hoopCount(11));
        assertEquals("Keep at it until you get it", HelpAlex.hoopCount(7));
    }
}
