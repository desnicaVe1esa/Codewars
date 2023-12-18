package simple_fun_27_rectangle_rotation.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void BasicTests() {
        assertEquals(23, Solution.rectangleRotation(6,4));
        assertEquals(65, Solution.rectangleRotation(30,2));
        assertEquals(49, Solution.rectangleRotation(8,6));
        assertEquals(333, Solution.rectangleRotation(16,20));
    }
}