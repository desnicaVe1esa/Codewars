package count_the_digit.java;
public class CountDig {
    
    public static int nbDig(int n, int d) {
        int k = 0;
        int result = 0;
        int iterator = 0;
        int count = 0;
        while (iterator <= n) {
            result = k * k;
            char[] c = String.valueOf(result).toCharArray();
            for (char value : c) {
                if (Character.getNumericValue(value) == d) {
                    count++;
                }
            }
            k++;
            iterator++;
        }
        return count;
    }
}
