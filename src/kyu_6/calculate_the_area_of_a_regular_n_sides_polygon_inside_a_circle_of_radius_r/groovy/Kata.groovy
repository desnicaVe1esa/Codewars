package kyu_6.calculate_the_area_of_a_regular_n_sides_polygon_inside_a_circle_of_radius_r.groovy

class Kata {
    static areaOfPolygonInsideCircle(r, n) {
        return Math.round(1e3 * (0.5 * n * r ** 2 * Math.sin(2 * Math.PI / n))) / 1e3;
    }
}
