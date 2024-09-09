package kyu_7.simple_beads_count.java;

public class BeadsCounter {
    public static int countRedBeads(final int nBlue) {
        return nBlue < 2 ? 0 : 2 * nBlue - 2;
    }
}