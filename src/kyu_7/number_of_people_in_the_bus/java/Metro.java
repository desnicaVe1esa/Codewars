package kyu_7.number_of_people_in_the_bus.java;

import java.util.ArrayList;

class Metro {

    public static int countPassengers(ArrayList<int[]> stops) {
        int result = 0;
        for (int[] stop : stops) {
            result += stop[0] - stop[1];
        }
        return result;
    }
}