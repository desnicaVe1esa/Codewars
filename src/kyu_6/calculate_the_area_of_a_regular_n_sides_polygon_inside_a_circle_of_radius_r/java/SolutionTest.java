package kyu_6.calculate_the_area_of_a_regular_n_sides_polygon_inside_a_circle_of_radius_r.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test1() {
        assertEquals(11.691, Kata.areaOfPolygonInsideCircle(3, 3), 1e-4);
    }

    @Test
    public void test2() {
        assertEquals(8, Kata.areaOfPolygonInsideCircle(2, 4), 1e-4);
    }

    @Test
    public void test3() {
        assertEquals(14.86, Kata.areaOfPolygonInsideCircle(2.5, 5), 1e-4);
    }
}
