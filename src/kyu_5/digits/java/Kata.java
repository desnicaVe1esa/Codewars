package kyu_5.digits.java;

import java.util.ArrayList;
import java.util.List;

public class Kata {
    private static List<int[]> possibleCodes;

    public static int[] tryToGuess(int matches) {
        if (matches == -1) {
            initializePossibleCodes();
            return possibleCodes.get(0);
        }

        List<int[]> newPossibleCodes = new ArrayList<>();
        for (int[] code : possibleCodes) {
            int matchCount = countMatches(code, possibleCodes.get(0));
            if (matchCount == matches) {
                newPossibleCodes.add(code);
            }
        }

        possibleCodes = newPossibleCodes;
        return possibleCodes.get(0);
    }

    private static int countMatches(int[] code1, int[] code2) {
        int count = 0;
        for (int i = 0; i < code1.length; i++) {
            if (code1[i] == code2[i]) {
                count++;
            }
        }
        return count;
    }

    private static void initializePossibleCodes() {
        possibleCodes = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 0; l <= 9; l++) {
                        if (isUniqueDigits(i, j, k, l)) {
                            possibleCodes.add(new int[]{i, j, k, l});
                        }
                    }
                }
            }
        }
    }

    private static boolean isUniqueDigits(int a, int b, int c, int d) {
        return a != b && a != c && a != d && b != c && b != d && c != d;
    }
}
