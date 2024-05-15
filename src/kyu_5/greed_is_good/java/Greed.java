package kyu_5.greed_is_good.java;

public class Greed {

    public static int greedy(int[] dice) {
        int result = 0;

        int[] arrForSolution = {0, 0, 0, 0, 0, 0, 0};
        for (int j : dice) arrForSolution[j]++;

        for (int i = 1; i < arrForSolution.length; i++) {
            if (i == 1) {
                result += (arrForSolution[i] > 2 ? 1000 + (arrForSolution[1] - 3) * 100 : arrForSolution[1] * 100);
            } else if (i == 5) {
                result += (arrForSolution[i] > 2 ? 500 + (arrForSolution[5] - 3) * 50 : arrForSolution[5] * 50);
            } else {
                result += (arrForSolution[i] > 2 ? i * 100 : 0);
            }
        }

        return result;
    }

}