package kyu_6.bit_counting.java;

public class BitCounting {

    public static int countBits(int n){
        int result = 0;
        String binary = Integer.toBinaryString(n);
        for (int i = 0; i < binary.toCharArray().length; i++) {
            if (binary.toCharArray()[i] == '1') {
                result++;
            }
        }
        return result;
    }
}
