package kyu_5.digits.java;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class KataTest {
    @Test()
    public void exampleTests() {
        int playersAttempts = 0;
        int matches = -1;
        int[] code = new int[]{1, 2, 3, 4};
        int[] answer = new int[4];
        answer = Kata.tryToGuess(matches);
        while (!Arrays.equals(answer, code) && playersAttempts < 100) {
            matches = 0;
            for (int l = 0; l < 4; l++)
                if (answer[l] == code[l])
                    matches++;
            if (matches < 4) {
                playersAttempts++;
                answer = Kata.tryToGuess(matches);
            }
        }
        boolean check = playersAttempts <= 16;
        String message = "The code: " + Arrays.toString(code) +
                ". Your last answer: " + Arrays.toString(answer) +
                ", calls: " + playersAttempts;
        assertTrue(message, check);
    }
}
