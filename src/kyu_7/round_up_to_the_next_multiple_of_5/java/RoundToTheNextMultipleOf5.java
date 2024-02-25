package kyu_7.round_up_to_the_next_multiple_of_5.java;

public class RoundToTheNextMultipleOf5 {
    public static int roundToNext5(int number) {
        while (number % 5 != 0) {
            number++;
        }
        return number;
    }
}