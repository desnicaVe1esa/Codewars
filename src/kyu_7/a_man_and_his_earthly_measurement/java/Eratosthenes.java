package kyu_7.a_man_and_his_earthly_measurement.java;


public class Eratosthenes {
    public static double circumference(double rodHeight, double shadowLength, double distanceToWell) {
        double degree = Math.toDegrees(Math.atan(shadowLength / rodHeight));
        return distanceToWell * 360 / degree;
    }
}