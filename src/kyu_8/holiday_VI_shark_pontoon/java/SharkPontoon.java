package kyu_8.holiday_VI_shark_pontoon.java;

public class SharkPontoon {
    public static String shark(int pontoonDistance, int sharkDistance,
                               int youSpeed, int sharkSpeed, boolean dolphin) {
        if (dolphin) {
            sharkSpeed *= 0.5;
        }
        return pontoonDistance / youSpeed <= sharkDistance / sharkSpeed ? "Alive!" : "Shark Bait!";
    }
}

