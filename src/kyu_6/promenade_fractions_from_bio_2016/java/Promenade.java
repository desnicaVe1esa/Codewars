package kyu_6.promenade_fractions_from_bio_2016.java;

public class Promenade{
    public static int[] promenade (String choice){
        int l = 1;
        int m = 0;
        int r = 0;
        int s = 1;

        int a = 1;
        int b = 1;

        for (char c : choice.toCharArray()) {
            if (c == 'L') {
                l = a;
                m = b;
            } else {
                r = a;
                s = b;
            }
            a = l + r;
            b = m + s;
        }
        return new int[]{a, b};
    }
}