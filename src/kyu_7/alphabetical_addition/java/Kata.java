package kyu_7.alphabetical_addition.java;

import java.util.Arrays;

public class Kata {

    public static String addLetters(String... letters) {
        int index = Arrays.stream(letters).mapToInt(l -> l.charAt(0) % 96).sum() % 26;
        return letters.length == 0 ? "z" : "" + (char) (96 + (index == 0 ? 26 : index));
    }
}
