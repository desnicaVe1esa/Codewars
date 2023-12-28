package playing_with_digits.java;

public class DigPow {
    public static long digPow(int n, int p) {
        String[] s = String.valueOf(n).split("");
        int expression = 0;
        for (String value : s) {
            expression += (int) (Math.pow(Double.parseDouble(value), p));
            p++;
        }
        int result = expression / n;
        if (expression == n * result) {
            return result;
        }
        return -1;
    }
}
