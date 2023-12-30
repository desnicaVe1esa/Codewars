package area_or_perimeter.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void testSomething() {
        assertEquals(16, Solution.areaOrPerimeter(4 , 4));
        assertEquals(32, Solution.areaOrPerimeter(6 , 10));
    }
}
