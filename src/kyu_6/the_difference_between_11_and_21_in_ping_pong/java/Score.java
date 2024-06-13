package kyu_6.the_difference_between_11_and_21_in_ping_pong.java;

import java.util.Objects;

public class Score {
    private int me;
    private int opponent;

    public Score(int me, int opponent) {
        this.me = me;
        this.opponent = opponent;
    }

    public void setMe(int me) {
        this.me = me;
    }

    public int getMe() {
        return me;
    }

    public void setOpponent(int opponent) {
        this.opponent = opponent;
    }

    public int getOpponent() {
        return opponent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Score score = (Score) o;
        return me == score.me && opponent == score.opponent;
    }

    @Override
    public int hashCode() {
        return Objects.hash(me, opponent);
    }

    @Override
    public String toString() {
        return "Score{" +
                "me=" + me +
                ", opponent=" + opponent +
                '}';
    }
}
