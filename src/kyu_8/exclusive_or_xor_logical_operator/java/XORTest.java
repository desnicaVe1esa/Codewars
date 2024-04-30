package kyu_8.exclusive_or_xor_logical_operator.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class XORTest {
    private static void testing(boolean actual, boolean expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void testBasic() {
        System.out.println("Testing basics.");
        testing(XOR.xor(false, false), false);
    }

    @Test
    public void testNested() {
        System.out.println("Testing nested calls.");
        testing(XOR.xor(false, XOR.xor(false, false)), false);
        testing(XOR.xor(XOR.xor(true, false), false), true);
    }
}