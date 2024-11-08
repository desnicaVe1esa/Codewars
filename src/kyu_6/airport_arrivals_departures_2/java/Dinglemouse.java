package kyu_6.airport_arrivals_departures_2.java;

public class Dinglemouse {

    public static String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ?!@#&()|<>.:=-+*/0123456789";

    public static int[][] flapRotors(final String[] linesBefore, final String[] linesAfter) {
        int[][] result = new int[linesBefore.length][];
        for (int i = 0; i < linesBefore.length; i++) {
            result[i] = new int[linesBefore[i].length()];
            int alphabetLength = ALPHABET.length();
            for (int j = 0; j < linesBefore[i].length(); j++) {
                int after = ALPHABET.indexOf(linesAfter[i].charAt(j));
                int before = (ALPHABET.indexOf(linesBefore[i].charAt(j)) + alphabetLength) % ALPHABET.length();
                alphabetLength += result[i][j] = (after - before + ALPHABET.length()) % ALPHABET.length();
            }
        }
        return result;
    }
}


