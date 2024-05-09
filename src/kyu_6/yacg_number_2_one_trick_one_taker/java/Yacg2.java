package kyu_6.yacg_number_2_one_trick_one_taker.java;

import java.util.HashMap;
import java.util.Map;

public class Yacg2 {


    public static String winnerOfTrick(String[] cards, String[] players) {
        if (cards == null || players == null || cards.length == 0 || players.length == 0) {
            return "";
        }
        int winnerIndex = getWinnerIndex(cards);
        return players[winnerIndex] + " wins";
    }

    public static int getWinnerIndex (String[] cards) {
        int winnerCard = 0;
        int winnerIndex = 0;
        String trump = String.valueOf(cards[0].toCharArray()[1]);
        Map <String, Integer> cardGrades = new HashMap<>();
        cardGrades.put("2", 2);
        cardGrades.put("3", 3);
        cardGrades.put("4", 4);
        cardGrades.put("5", 5);
        cardGrades.put("6", 6);
        cardGrades.put("7", 7);
        cardGrades.put("8", 8);
        cardGrades.put("9", 9);
        cardGrades.put("T", 10);
        cardGrades.put("J", 11);
        cardGrades.put("Q", 12);
        cardGrades.put("K", 13);
        cardGrades.put("A", 14);
        for (int i = 0; i < cards.length; i++) {
            if (cards[i].contains(trump)) {
                int currentCardGrade = cardGrades.getOrDefault(String.valueOf(cards[i].toCharArray()[0]), null);
                winnerCard = Math.max(winnerCard, currentCardGrade);
                if (winnerCard == currentCardGrade) {
                    winnerIndex = i;
                }
            }
        }
        return winnerIndex;
    }
}