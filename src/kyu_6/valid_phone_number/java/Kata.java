package kyu_6.valid_phone_number.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Kata {
    public static boolean validPhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile("^\\(\\d{3}\\) \\d{3}-\\d{4}$");
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.find();
    }
}
