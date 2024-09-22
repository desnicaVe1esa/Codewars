package kyu_6.even_gray_code.java;

public class GrayCode {
    public static String evenGrayCode(int size, int position) {
        String result = Integer.toBinaryString(position);
        long evens = result.chars().filter(ch -> ch == '1').count() % 2;
        if (evens == 0) {
            result += "0";
        } else {
            result += "1";
        }
        return "0".repeat(size - result.length()) + result;
    }
}
