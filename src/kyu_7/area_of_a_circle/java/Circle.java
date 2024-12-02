package kyu_7.area_of_a_circle.java;

public class Circle {

    public static double area(double radius) {
        if (radius < 1) {
            throw new IllegalArgumentException();
        }
        return Math.PI * Math.pow(radius, 2);
    }
}
