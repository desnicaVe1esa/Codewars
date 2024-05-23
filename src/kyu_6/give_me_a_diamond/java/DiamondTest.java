package kyu_6.give_me_a_diamond.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiamondTest {
    @Test
    public void testDiamond3() {
        StringBuffer expected = new StringBuffer();
        expected.append(" *\n");
        expected.append("***\n");
        expected.append(" *\n");

        assertEquals(expected.toString(), Diamond.print(3));
    }

    @Test
    public void testDiamond5() {
        StringBuffer expected = new StringBuffer();
        expected.append("  *\n");
        expected.append(" ***\n");
        expected.append("*****\n");
        expected.append(" ***\n");
        expected.append("  *\n");

        assertEquals(expected.toString(), Diamond.print(5));
    }

    @Test
    public void testDiamond1() {
        StringBuffer expected = new StringBuffer();
        expected.append("*\n");
        assertEquals(expected.toString(), Diamond.print(1));
    }

    @Test
    public void testDiamond0() {
        assertEquals(null, Diamond.print(0));
    }

    @Test
    public void testDiamondMinus2() {
        assertEquals(null, Diamond.print(-2));
    }

    @Test
    public void testDiamond2() {
        assertEquals(null, Diamond.print(2));
    }
}