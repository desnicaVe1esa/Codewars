package kyu_6.yacg_number_2_one_trick_one_taker.java;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class SolutionTest {
    private final String[] players = {"Algichh", "Bdobd", "Chharmolg", "Dbang", "Erming", "fRangk", "gRachh"};

    @Test
    public void sampleTests() {
        test(new String[]{"AH", "2H", "3H"}, 0);
        test(new String[]{"2H", "KH", "3H"}, 1);
        test(new String[]{"2H", "3H", "4H"}, 2);
        test(new String[]{"2S", "KC", "2C", "3C"}, 0);
        test(new String[]{"2C", "KD", "QC", "3C"}, 2);
        test(new String[]{"2C", "3C", "JD", "4C"}, 3);
        test(new String[]{"9D", "6D", "9C"}, 0);
        test(new String[]{"TC", "QC", "QS"}, 1);
        test(new String[]{"3S", "3H", "4S"}, 2);
    }

    public void test(String[] cards, int winner) {
        String userSolution = Yacg2.winnerOfTrick(cards, Arrays.copyOf(players, cards.length));
        String text = Arrays.toString(cards) + " should be won by "
                + (winner + 1) + ". player: " + players[winner]
                + " with " + cards[winner];
        System.out.println(text);
        assertEquals(text, players[winner] + " wins", userSolution);
    }
}
