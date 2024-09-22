package kyu_8.localize_the_barycenter_of_a_triangle.java;

class Barycenter {

    public static double[] barTriang(double[] x, double[] y, double[] z) {
        return new double[]{
                (double) ((int) Math.round((x[0] + y[0] + z[0]) / 3 * 10000)) / 10000,
                (double) ((int) Math.round((x[1] + y[1] + z[1]) / 3 * 10000)) / 10000
        };
    }
}