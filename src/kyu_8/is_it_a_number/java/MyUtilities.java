package kyu_8.is_it_a_number.java;

public class MyUtilities {

    public boolean isDigit(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        String trimmedStr = s.trim();
        try {
            Double.parseDouble(trimmedStr);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}