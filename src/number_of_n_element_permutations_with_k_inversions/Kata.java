package number_of_n_element_permutations_with_k_inversions;

public class Kata {

    public static long permuversion(int n, int k) {
        long[] result = new long[k + 1];
        result[0] = 1;
        for (int i = 2; i <= n; i++) {
            long[] array = new long[k + 1];
            for (int j = 0; j <= k; j++) {
                for (int l = Math.max(0, j - i + 1); l <= j; l++) {
                    array[j] += result[l];
                }
            }
            result = array;
        }
        return result[k];
    }
}
