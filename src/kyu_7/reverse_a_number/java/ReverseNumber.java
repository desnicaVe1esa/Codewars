package kyu_7.reverse_a_number.java;

public class ReverseNumber {

    public static int reverse(int number) {
        int modNum = Math.abs(number);
        StringBuilder prepared = new StringBuilder();
        int result = 0;
        while (modNum != 0) {
            prepared.append(modNum % 10);
            modNum /= 10;
        }
        return number < 0 ?
                -1 * Integer.parseInt(prepared + "") :
                Integer.parseInt(prepared + "");
    }
}

