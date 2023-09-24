package regex_validate_pin_code.java;

public class Solution {
    public static boolean validatePin(String pin) {
        return (pin.length() == 4 || pin.length() == 6) && pin.matches("[0-9]*");
    }
}
