package kyu_8.grasshopper_summation.java;

public class GrassHopper {

    public static int summation(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += (n - i);
        }
        return result;
    }
}
