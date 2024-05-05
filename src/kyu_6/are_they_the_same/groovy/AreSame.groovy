package kyu_6.are_they_the_same.groovy

public class AreSame {

    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) Math.pow(a[i], 2);
        }
        def finalA = a as List
        def finalB = b as List
        return finalA.sort() == finalB.sort();
    }
}
