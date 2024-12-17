package kyu_6.bingo_card.java;

import java.util.ArrayList;
import java.util.Random;

public class BingoCard {
    public static String[] getCard() {
        ArrayList<String> cards = new ArrayList<>();
        Random r = new Random();

        cards.addAll(r.ints(1, 16).distinct().limit(5).mapToObj(i -> String.format("B%d", i)).toList());
        cards.addAll(r.ints(16, 31).distinct().limit(5).mapToObj(i -> String.format("I%d", i)).toList());
        cards.addAll(r.ints(31, 46).distinct().limit(4).mapToObj(i -> String.format("N%d", i)).toList());
        cards.addAll(r.ints(46, 61).distinct().limit(5).mapToObj(i -> String.format("G%d", i)).toList());
        cards.addAll(r.ints(61, 76).distinct().limit(5).mapToObj(i -> String.format("O%d", i)).toList());

        return cards.toArray(new String[24]);
    }
}