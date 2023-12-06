package the_supermarket_queue.java;

import java.util.Arrays;

public class Solution {

    public static int solveSuperMarketQueue(int[] customers, int n) {
        int[] result = new int[n];
        for (int customer : customers) {
            result[0] += customer;
            Arrays.sort(result);
        }
        return result[n - 1];
    }
}