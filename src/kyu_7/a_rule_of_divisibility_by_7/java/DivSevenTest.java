package kyu_7.a_rule_of_divisibility_by_7.java;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DivSevenTest {

    @Test
    public void test1() {
        System.out.println("Basic Tests");
        assertArrayEquals(new long[]{7, 2}, DivSeven.seven(1603));
        assertArrayEquals(new long[]{35, 1}, DivSeven.seven(371));
        assertArrayEquals(new long[]{42, 1}, DivSeven.seven(483));
    }
}
