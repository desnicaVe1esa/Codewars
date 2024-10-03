package kyu_7.strong_number_special_numbers_series_2.java;

class StrongNumber {

    public static String isStrongNumber(int num) {
        int munForFact = num;
        int result = 0;
        while (munForFact >= 1) {
            result += factorial(munForFact % 10);
            munForFact /= 10;
        }
        return result == num ? "STRONG!!!!" : "Not Strong !!";
    }

    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}
