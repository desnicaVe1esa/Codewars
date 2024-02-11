package kyu_8.i_love_you_a_little_a_lot_passionately_dot_dot_dot_not_at_all.java;

public class Sid {
    public static String howMuchILoveYou(int nb_petals) {
        String[] data = {"I love you", "a little", "a lot", "passionately", "madly", "not at all"};
        int index = (nb_petals - 1) % data.length;
        return data[index];
    }
}
