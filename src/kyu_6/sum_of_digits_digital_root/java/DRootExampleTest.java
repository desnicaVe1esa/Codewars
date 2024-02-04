package kyu_6.sum_of_digits_digital_root.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DRootExampleTest {
    @Test
    public void Test1() {
        assertEquals( "Nope!" , 7, DRoot.digital_root(16));
    }
    @Test
    public void Test2() {
        assertEquals( "Nope!" , 6, DRoot.digital_root(456));
    }
    @Test
    public void Test3() {
        assertEquals( "Nope!" , 1, DRoot.digital_root(505792));
    }
}