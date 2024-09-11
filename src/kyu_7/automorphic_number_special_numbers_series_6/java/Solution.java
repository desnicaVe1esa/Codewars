package kyu_7.automorphic_number_special_numbers_series_6.java;

public class Solution {
    public static String autoMorphic(int number) {
        int divisor = number < 10 ? 10 : number > 10 && number < 100 ? 100 : 1000;
        return (int) Math.pow(number, 2) % divisor == number % divisor ? "Automorphic" : "Not!!";
    }
}
