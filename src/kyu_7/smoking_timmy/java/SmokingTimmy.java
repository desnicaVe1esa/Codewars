package kyu_7.smoking_timmy.java;

public class SmokingTimmy {
    public static int startSmoking(int bars, int boxes) {
        return (int) (225 * bars + 22.5 * boxes - .5);
    }
}