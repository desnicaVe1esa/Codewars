package moduli_number_system.java;

import java.util.Arrays;

public class ModSystem {

    public static String fromNb2Str(int n, int[] sys) {
        int product = Arrays.stream(sys).reduce(1, (a, b) -> a * b);

        if (!arePairwiseCoPrime(sys) || product <= n) {
            return "Not applicable";
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sys.length; i++) {
            int residue = n % sys[i];
            result.append("-").append(residue).append("-");
        }

        return result.toString();
    }

    private static boolean arePairwiseCoPrime(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (gcd(numbers[i], numbers[j]) != 1) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
