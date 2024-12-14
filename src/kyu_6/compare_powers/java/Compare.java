package kyu_6.compare_powers.java;

public class Compare {
    public static int comparePowers(int[] number1, int[] number2) {

        return Double.compare(number2[1] * Math.log(number2[0]), number1[1] * Math.log(number1[0]));
    }
}
