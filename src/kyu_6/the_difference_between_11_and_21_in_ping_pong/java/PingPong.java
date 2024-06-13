package kyu_6.the_difference_between_11_and_21_in_ping_pong.java;

import java.util.ArrayList;
import java.util.List;

public class PingPong {
    static List<Score> result(String s) {
        var total = getScores(s, 10);
        total.addAll(getScores(s, 20));
        return total;
    }

    static List<Score> getScores(String game, int n) {
        var scores = new ArrayList<Score>();
        int me = 0;
        int opponent = 0;
        for (char match : game.toCharArray()) {
            if (match == 'W') {
                me++;
            } else {
                opponent++;
            }
            if ((me > n || opponent > n) && Math.abs(me - opponent) > 1) {
                scores.add(new Score(me, opponent));
                me = 0;
                opponent = 0;
            }
        }
        if (me > 0 || opponent > 0) {
            scores.add(new Score(me, opponent));
        }
        return scores;
    }
}
