package kyu_7.clean_up_after_your_dog.java;

public class Kata {
    public static String crap(char[][] garden, int bags, int cap) {
        int total = bags * cap;
        int count = 0;
        for (int i = 0; i < garden.length; i++) {
            for (int j = 0; j < garden[i].length; j++) {
                if (garden[i][j] == 'D') {
                    return "Dog!!";
                }
                if (garden[i][j] == '@') {
                    count++;
                }
            }
        }
        return total >= count ? "Clean" : "Cr@p";
    }
}
