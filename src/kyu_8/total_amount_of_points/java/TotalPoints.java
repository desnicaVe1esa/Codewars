package kyu_8.total_amount_of_points.java;

public class TotalPoints {

    public static int points(String[] games) {
        int result = 0;
        for (String game : games) {
            String[] score = game.split(":");
            int x = Integer.parseInt(score[0]);
            int y = Integer.parseInt(score[1]);
            result += x > y ? 3 : x < y ? 0 : 1;
        }
        return result;
    }
}
