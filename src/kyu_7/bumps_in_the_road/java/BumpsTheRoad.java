package kyu_7.bumps_in_the_road.java;

public class BumpsTheRoad {
    public static String bumps(final String road) {
        return road.replace("_", "").length() <= 15 ? "Woohoo!" : "Car Dead";
    }
}
