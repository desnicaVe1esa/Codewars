package kyu_4.square_into_squares_protect_trees.java;

public class Decompose {

    private String tryDecomp(long nb, long rac) {
        if (nb == 0) {
            return "";
        }
        String l;
        long i = rac;
        while (i >= (long) Math.sqrt(nb / 2.0) + 1) {
            long diff = nb - i * i;
            rac = (long) Math.sqrt(diff);
            l = tryDecomp(diff, rac);
            if (l != null) {
                return l + " " + i;
            }
            i -= 1;
        }
        return null;
    }

    public String decompose(long n) {
        String l = tryDecomp(n * n, (long) Math.sqrt(n * n - 1));
        return l != null ? l.trim() : l;
    }
}