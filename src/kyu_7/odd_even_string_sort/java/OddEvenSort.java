package kyu_7.odd_even_string_sort.java;

public class OddEvenSort {
    public static String sortMyString(String s) {
        StringBuilder result = new StringBuilder();
        result.append(even(s)).append(" ").append(odd(s));
        return result.toString();
    }

    /* Получает все четные буквы */
    public static String even(String s) {
        StringBuilder evens = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                evens.append(s.charAt(i));
            }
        }
        return evens.toString();
    }

    /* Получает все нечетные буквы */
    public static String odd(String s) {
        StringBuilder odds = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 != 0) {
                odds.append(s.charAt(i));
            }
        }
        return odds.toString();
    }
}