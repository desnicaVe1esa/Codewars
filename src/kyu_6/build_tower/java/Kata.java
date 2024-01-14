package kyu_6.build_tower.java;


public class Kata {
    public static String[] towerBuilder(int nFloors) {
        String[] result = new String[nFloors];
        int width = nFloors * 2 - 1;
        for (int i = 0; i < nFloors; i++) {
            int stars = i * 2 + 1;
            int spaces = (width - stars) / 2;
            StringBuilder floor = new StringBuilder();
            for (int j = 0; j < spaces; j++) {
                floor.append(" ");
            }
            for (int j = 0; j < stars; j++) {
                floor.append("*");
            }
            for (int j = 0; j < spaces; j++) {
                floor.append(" ");
            }
            result[i] = floor.toString();
        }
        return result;
    }
}