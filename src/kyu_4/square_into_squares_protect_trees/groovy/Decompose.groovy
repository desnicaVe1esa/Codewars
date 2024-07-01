package kyu_4.square_into_squares_protect_trees.groovy;

public class Decompose {
    public static String decompose(long n) {
        return getFromRemainder(n ** 2, n)
    }

    public static String getFromRemainder(long rem, long limit) {
        for (long i = limit - 1; i > 0; i--) {
            if (i ** 2 == rem) {
                return "$i"
            } else if (i ** 2 <= rem) {
                String innerRes = getFromRemainder(rem - (i ** 2), i)
                if (innerRes != null) {
                    return innerRes + " $i"
                }
            }
        }
        return null
    }
}