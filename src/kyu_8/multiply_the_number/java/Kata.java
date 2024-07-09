package kyu_8.multiply_the_number.java;

public class Kata {
    public static int multiply(int number) {
        return number * (int) Math.pow(5, number < 0 ? String.valueOf(number).length() - 1 : String.valueOf(number).length());
    }
}
