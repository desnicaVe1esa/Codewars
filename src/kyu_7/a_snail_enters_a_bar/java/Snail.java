package kyu_7.a_snail_enters_a_bar.java;

public class Snail {
    public static boolean canSnailReachEnd(double length, double speed, double lengthIncreases) {
        double snailS = 0;
        for (var x = 0; x < 525605; x++) {
            snailS = snailS + speed - lengthIncreases;
            if (snailS >= length) {
                return true;
            }
        }
        return false;
    }
}

