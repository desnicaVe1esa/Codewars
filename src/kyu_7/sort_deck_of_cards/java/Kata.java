package kyu_7.sort_deck_of_cards.java;

import java.util.Arrays;

public class Kata {
    public static String[] sortCards(String[] cards) {
        String[] pattern = new String []{"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K"};
        Arrays.sort(cards, (a, b) -> {
            int indexA = Arrays.asList(pattern).indexOf(a);
            int indexB = Arrays.asList(pattern).indexOf(b);
            if (indexA == indexB) {
                return 0;
            }
            return indexA - indexB;
        });
        return cards;
    }
}