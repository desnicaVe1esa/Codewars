package kyu_8.area_of_a_square.java;

public class Geometry {
    public static double squareArea(double A) {
        double area = Math.pow(A, 2) / Math.PI;
        double radius = Math.sqrt(area / Math.PI);
        return Math.round(Math.pow(radius, 2.0) * 4.0 * 100.0) / 100.0;
    }
}