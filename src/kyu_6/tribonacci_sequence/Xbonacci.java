package kyu_6.tribonacci_sequence;

// Возвращает сумму последних 3-х чисел. Есть последовательность Фибоначчи, а теперь есть пследовательность Трибоначчи.

public class Xbonacci {
    public double[] tribonacci(double[] s, int n) {
        double[] result = new double[n];
        if (n == 0) return result;
        int sLength = s.length;
        for (int i = 0; i < sLength && i < n; i++) {
            result[i] = s[i];
        }
        for (int i = sLength; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2] + result[i - 3];
            sLength++;
        }
        return result;
    }
}