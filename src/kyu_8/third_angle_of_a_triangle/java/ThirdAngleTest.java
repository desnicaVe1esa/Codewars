package kyu_8.third_angle_of_a_triangle.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ThirdAngleTest {
    @Test
    public void testOtherAngle() {
        assertEquals(123, ThirdAngle.otherAngle(45,12));
        assertEquals(70, ThirdAngle.otherAngle(50,60));
    }
}