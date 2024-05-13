package kyu_8.expressions_matter.java;


public class Kata {
    public static int expressionsMatter(int a, int b, int c) {
        int result = 0;
        if (a + b + c > result) {
            result = a + b + c;
        }
        if ((a + b) * c > result) {
            result = (a + b) * c;
        }
        if (a * (b + c) > result) {
            result = a * (b + c);
        }
        if (a * b * c > result) {
            result = a * b * c;
        }
        return result;
    }
}