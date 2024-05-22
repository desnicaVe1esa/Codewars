package kyu_7.make_me_slow.java;

public class Kata {
    public static void makeMeSlow() {
        for (int i = 0; i < 7; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception ignored) {}
        }
    }
}