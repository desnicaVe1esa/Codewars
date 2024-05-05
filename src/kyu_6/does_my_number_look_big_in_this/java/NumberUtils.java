package kyu_6.does_my_number_look_big_in_this.java;

public class NumberUtils {
    public static boolean isNarcissistic(int number) {
        int length = String.valueOf(number).length();
        int forCalculation = number;
        int[] arr = new int[length];
        int result = 0;
        for (int i = 0; i < length; i++) {
            arr[i] = forCalculation % 10;
            forCalculation /= 10;
        }
        for (int j : arr) {
            result += Math.pow(j, length);
        }
        return result == number;
    }
}