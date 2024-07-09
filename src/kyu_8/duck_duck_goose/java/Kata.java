package kyu_8.duck_duck_goose.java;


public class Kata {
    public static String duckDuckGoose(Player[] players, int goose) {
        int position = goose % players.length;
        return position == 0 ? players[players.length - 1].getName(): players[position - 1].getName();
    }
}
