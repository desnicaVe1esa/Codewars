package kyu_8.thinkful_number_drills_blue_and_red_marbles.java;

public class BlueAndRedMarbles {
    public static double guessBlue(int blueStart, int redStart, int bluePulled, int redPulled) {
        double blue = blueStart - bluePulled;
        double total = (blueStart - bluePulled) + (redStart - redPulled);
        return blue / total;
    }
}
