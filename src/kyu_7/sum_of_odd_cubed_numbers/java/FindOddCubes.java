package kyu_7.sum_of_odd_cubed_numbers.java;

public class FindOddCubes {

    public static int cubeOdd(int arr[]) {
        int result = 0;
        for (int j : arr) {
            if (j % 2 != 0) {
                result += Math.pow(j, 3);
            }
        }
        return result;
    }
}
