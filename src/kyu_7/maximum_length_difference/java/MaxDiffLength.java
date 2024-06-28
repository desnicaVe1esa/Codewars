package kyu_7.maximum_length_difference.java;

class MaxDiffLength {
    public static int mxdiflg(String[] a1, String[] a2) {
        int result = -1;
        for(int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                result = Math.max(result, Math.abs(a1[i].length() - a2[j].length()));
            }
        }
        return result;
    }
}