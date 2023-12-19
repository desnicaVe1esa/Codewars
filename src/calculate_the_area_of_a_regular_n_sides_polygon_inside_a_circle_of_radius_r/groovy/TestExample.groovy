package calculate_the_area_of_a_regular_n_sides_polygon_inside_a_circle_of_radius_r.groovy

import org.junit.Test

class TestExample {
    @Test
    void "Basic Tests"() {
        assert Kata.areaOfPolygonInsideCircle(3, 3) == 11.691
        assert Kata.areaOfPolygonInsideCircle(2, 4) == 8
        assert Kata.areaOfPolygonInsideCircle(2.5, 5) == 14.86
    }
}
