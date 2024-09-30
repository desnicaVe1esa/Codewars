package kyu_6.find_the_x_from_equation.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindItTest {
    @Test
    public void testCase() {
        FindIt bd = new FindIt();
        assertEquals(3,bd.findIt("99X=1(mod 8)"));
        assertEquals(2,bd.findIt("72X=1(mod 11)"));
        assertEquals(4,bd.findIt("88X=1(mod 9)"));
        assertEquals(2,bd.findIt("28X=1(mod 5)"));
        assertEquals(1,bd.findIt("493X=1(mod 3)"));
        assertEquals(1,bd.findIt("6336X=1(mod 5)"));
        assertEquals(4,bd.findIt("16X=1(mod 9)"));
        assertEquals(-1,bd.findIt("145X=1(mod 10)"));

    }
}