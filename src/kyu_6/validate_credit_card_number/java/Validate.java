package kyu_6.validate_credit_card_number.java;

public class Validate {
    public static boolean validate(String n) {
        int number = n.length();
        int total = 0;
        boolean even = true;
        for (int i = number - 2; i >= 0; i--) {
            int digit = n.charAt(i) - '0';
            if (digit < 0 || digit > 9) {
                return false;
            }
            if (even) {
                digit <<= 1;
            }
            even = !even;
            total += digit > 9 ? digit - 9 : digit;
        }
        int checksum = n.charAt(number - 1) - '0';
        return (total + checksum) % 10 == 0;
    }
}