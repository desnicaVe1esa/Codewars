package kyu_6.consonant_value.java;

public class ConsonantValue {
    public static int solve(final String s) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int result = 0;
        int compare = 0;
        String[] preparedResult = s.split("[aeiou]");
        for (int i = 0; i < preparedResult.length; i++) {
            for (int j = 0; j < preparedResult[i].length(); j++) {
                compare += alphabet.indexOf(preparedResult[i].charAt(j)) + 1;
            }
            result = Math.max(compare, result);
            compare = 0;
        }
        return result;
    }
}