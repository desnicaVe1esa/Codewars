package kyu_6.find_the_missing_letter.java;

public class Kata {
    public static char findMissingLetter(char[] array) {
        for (int i = 0; i < array.length; i++) {
            if ((int) array[i + 1] - (int) array[i] == 2) {
                return (char) ((int) array[i] + 1);
            }
        }
        return ' ';
    }
}
