package kyu_7.interlocking_binary_pairs.java;


public class Kata {
    public static boolean interlockable(long a, long b) {
        String sA = toBinary(a);
        String sB = toBinary(b);
        int lengthMin = Math.min(sA.length(), sB.length());
        for (int i = 0; i < lengthMin; i++) {
            if (sA.charAt(i) == '1' && sB.charAt(i) == '1') {
                return false;
            }
        }
        return true;
    }

    public static String toBinary(long i) {
        StringBuilder result = new StringBuilder();
        while (i > 0) {
            result.append(i % 2);
            i /= 2;
        }
        return result.toString();
    }
}
