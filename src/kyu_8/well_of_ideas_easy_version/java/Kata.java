package kyu_8.well_of_ideas_easy_version.java;

public class Kata {

    public static String well(String[] x) {
        int goodCount = 0;
        for (String s : x) {
            if (s.equals("good")) {
                goodCount++;
            }
        }
        return goodCount == 0 ? "Fail!" : goodCount > 2 ? "I smell a series!" : "Publish!";
    }
}
