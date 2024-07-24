package kyu_6.reverse_or_rotate.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RevRotTest {
    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        System.out.println("Fixed Tests: revRot");
        testing(RevRot.revRot("1234", 0), "");
        testing(RevRot.revRot("", 0), "");
        testing(RevRot.revRot("1234", 5), "");
        String s = "123456987654";
        testing(RevRot.revRot(s, 6), "234561876549");
        String s1 = "25319664622716";
        testing(RevRot.revRot(s1, 5), "9135226466");
    }
}

