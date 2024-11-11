package kyu_6.bitcoin_statistics.java;

import java.util.*;
import java.util.stream.Collectors;

public class Stats {
    public static double[][] getMinAvgMax(int discard, double[][] data) {
        double min = Double.MAX_VALUE;
        double sumForAvg = 0;
        double avg = 0;
        double max = Double.MIN_VALUE;
        double[][] preparedForResult = new double[data.length][];
        List<Double> total = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            for (int j = discard; j < data[i].length - discard; j++) {
                min = Math.min(data[i][j], min);
                sumForAvg += data[i][j];
                max = Math.max(data[i][j], max);
                total.add(data[i][j]);
            }
            avg = sumForAvg / ((data[i].length - discard) - discard);
            preparedForResult[i] = new double[]{min, avg, max};
            min = Double.MAX_VALUE;
            sumForAvg = 0;
            avg = 0;
            max = Double.MIN_VALUE;
        }
        total = total.stream().filter(f -> f > 0.0).collect(Collectors.toList());
        double[][] result = new double[preparedForResult.length + 1][];
        result = Arrays.copyOf(preparedForResult, result.length);
        result[result.length - 1] = new double[]{
                Collections.min(total),
                total.stream().mapToDouble(m -> m).average().getAsDouble(),
                Collections.max(total)
        };
        return result;
    }
}

