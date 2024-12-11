package kyu_8.grader.java;

public class Grader {
    public static String grader(double score) {
        if (score > 1.0 || score < 0.6) {
            return "F";
        } else if (score <= 1.0 && score >= 0.9) {
            return "A";
        } else if (score <= 1.0 && score >= 0.8) {
            return "B";
        } else if (score <= 1.0 && score >= 0.7) {
            return "C";
        }else if (score <= 1.0 && score >= 0.6) {
            return "D";
        }
        return "";
    }
}
