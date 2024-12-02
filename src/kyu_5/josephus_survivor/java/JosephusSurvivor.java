package kyu_5.josephus_survivor.java;

public class JosephusSurvivor {
    public static int josephusSurvivor(final int n, final int k) {
        int result = 0;
        for (int i =  1; i < n + 1; i++) {
            result = (result + k) % i;
        }
        return result + 1;
    }
}
