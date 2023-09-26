package printer_errors.java;

public class Printer {
    public static String printerError(String s) {
        char[] arr = s.toCharArray();
        int count = 0;
        for (char c : arr) {
            if (c >= 'a' && c <= 'm') {
                count++;
            }
        }
        return s.length() - count + "/" + s.length();
    }
}
