package kyu_5.airport_arrivals_aepartures_1.java;


class Dinglemouse {

    private static final String ALPHABET = Preloaded.ALPHABET;

    public static String[] flapDisplay(final String[] lines, final int[][] rotors) {
        String[] result = new String[lines.length];
        for (int i = 0; i < lines.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            int rot = 0;
            for (int j = 0; j < lines[i].length(); j++) {
                rot += rotors[i][j];
                stringBuilder.append(ALPHABET.charAt((ALPHABET.indexOf(lines[i].charAt(j)) + rot) % ALPHABET.length()));
            }
            result[i] = stringBuilder.toString();
        }
        return result;
    }
}
