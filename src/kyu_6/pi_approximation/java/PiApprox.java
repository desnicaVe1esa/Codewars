package kyu_6.pi_approximation.java;

public class PiApprox {

    public static String iterPi2String(Double epsilon) {
        double pi = 0.0;
        int count = 0;
        while (true) {
            double term = (Math.pow(-1, count)) / (2 * count + 1);
            pi += term;
            if (Math.abs(pi * 4 - Math.PI) < epsilon) {
                count++;
                break;
            }
            count++;
        }
        return "[" + count + ", " + String.format("%.10f", pi * 4).replace(",", ".") + "]";
    }
}
