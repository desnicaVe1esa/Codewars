package kyu_8.grasshopper_grade_book.java;

public class GrassHopper {
    public static char getGrade(int s1, int s2, int s3) {
        int avg = (s1 + s2 + s3) / 3;
        char result = ' ';
        if (90 <= avg && avg <= 100) { result = 'A'; }
        if (80 <= avg && avg < 90) { result = 'B'; }
        if (70 <= avg && avg < 80) { result = 'C'; }
        if (60 <= avg && avg < 70) { result = 'D'; }
        if (0 <= avg && avg < 60) { result = 'F'; }
        return result;
    }
}
