package kyu_5.find_the_smallest.java;

public class ToSmallest {

    public static long[] smallest(long n) {
        // this method will not work for negative n
        assert n >= 0;
        // Convert n to a string
        String s = "" + n;
        final int numDigits = s.length();
        // track the best results so far
        String smallest = s;
        long smallesti = 0;
        long smallestj = 0;
        // since we need to find the smallest i, increment i in the outer loop
        for (int i = 0; i < numDigits; i++) {
            for (int j = 0; j < numDigits; j++) {
                // skip the no-op case when i == j
                if (i == j) continue;
                // compute the transformed number as a string
                // first remove the digit at index i
                String s2 = s.substring(0,i) + s.substring(i+1);
                // then insert it at index j
                s2 = s2.substring(0,j) + s.charAt(i) + s2.substring(j);
                // since the old and new numbers are the same string length,
                // string and numeric comparison will yield the same result
                if (smallest.compareTo(s2) > 0) {
                    smallest = s2;
                    smallesti = i;
                    smallestj = j;
                }
            }
        }
        return new long[]{Long.valueOf(smallest), smallesti, smallestj};
    }
}