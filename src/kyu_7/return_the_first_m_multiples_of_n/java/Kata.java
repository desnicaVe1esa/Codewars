package kyu_7.return_the_first_m_multiples_of_n.java;

public class Kata {
    public static int[] multiples(int m, int n) {
        int[] result = new int[m];
        for (int i = 1, j = 0; i <= m && j < m; i++, j++) {
            result[j] = n * i;
        }
        return result;
    }
}
