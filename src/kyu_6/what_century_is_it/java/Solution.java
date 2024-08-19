package kyu_6.what_century_is_it.java;

public class Solution {
    public static String whatCentury(int year) {
        if (year % 100 == 0) {
            year = year / 100;
        } else {
            year = (year / 100) + 1;
        }
        String postfix = "th";
        if (year % 10 == 1) {
            postfix = "st";
        }
        if (year % 10 == 2) {
            postfix = "nd";
        }
        if (year % 10 == 3) {
            postfix = "rd";
        }
        if (year > 10 && year <= 13) {
            postfix = "th";
        }

        return year + postfix;
    }
}