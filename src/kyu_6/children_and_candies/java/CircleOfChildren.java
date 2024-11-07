package kyu_6.children_and_candies.java;

import java.util.Arrays;

public class CircleOfChildren {
    public static int[] distributionOfCandy(int[] candies) {
        int distributions = 0;
        while (Arrays.stream(candies).distinct().count() > 1) {
            candies = Arrays.stream(candies).map(m -> m % 2 == 0 ? m : m + 1).toArray();
            int[] numToDis = Arrays.stream(candies).map(m -> m / 2).toArray();

            for (int i = 0; i < candies.length; i++) {
                candies[i] -= numToDis[i];
                if (i == candies.length - 1) {
                    candies[0] += numToDis[i];
                } else {
                    candies[i + 1] += numToDis[i];
                }
            }
            distributions++;
        }
        return new int[]{distributions, candies[0]};
    }
}

