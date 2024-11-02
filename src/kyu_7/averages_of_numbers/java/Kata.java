package kyu_7.averages_of_numbers.java;

public class Kata {
    public static double[] averages(int[] numbers) {
        if (numbers == null) {
            return new double[]{};
        }
        if (numbers.length == 0 || numbers.length == 1) {
            return new double[]{};
        }
        double[] result = new double[numbers.length - 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = (numbers[i] + numbers[i + 1]) / 2.0;
        }
        return result;
    }
}
