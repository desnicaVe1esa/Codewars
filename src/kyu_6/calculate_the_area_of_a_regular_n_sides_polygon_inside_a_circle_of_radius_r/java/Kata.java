package kyu_6.calculate_the_area_of_a_regular_n_sides_polygon_inside_a_circle_of_radius_r.java;

public class Kata {
    public static double areaOfPolygonInsideCircle(double circleRadius, int numberOfSides) {
        return Math.round(.5e3 * numberOfSides * Math.pow(circleRadius, 2) * Math.sin(6.2831853 / numberOfSides)) / 1.0e3;
    }
}
