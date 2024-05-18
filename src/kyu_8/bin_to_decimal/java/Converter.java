package kyu_8.bin_to_decimal.java;

public class Converter{
    public static int binToDecimal(String inp){
        int result = 0, p = 0;
        for (int i = inp.length() - 1; i >= 0; i--) {
            if (inp.charAt(i) == '1') {
                result += Math.pow(2, p);
            }
            p++;
        }
        return result;
    }
}