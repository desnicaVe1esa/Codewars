package kyu_5.count_ip_addresses.java;

import java.util.Arrays;

public class CountIPAddresses {

    public static long ipsBetween(String start, String end) {
        int[] ends = Arrays.stream(end.split("\\.")).mapToInt(Integer::parseInt).toArray(); // 1010 0 0 110010
        int[] starts = Arrays.stream(start.split("\\.")).mapToInt(Integer::parseInt).toArray(); // 1010 0 0 0
        long result = 1;
        int power = 3;
        for (int i = 0; i < starts.length; i++) {
            result += (ends[i] - starts[i]) * Math.pow(256, power);
            power--;
        }
        return result - 1;
    }
}
