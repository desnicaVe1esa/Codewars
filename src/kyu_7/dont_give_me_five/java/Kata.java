package kyu_7.dont_give_me_five.java;

public class Kata {
    public static int dontGiveMeFive(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (!(String.valueOf(i).contains("5"))) {
                count++;
            }
        }
        return count;
    }
}