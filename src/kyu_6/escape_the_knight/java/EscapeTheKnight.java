package kyu_6.escape_the_knight.java;

public class EscapeTheKnight {
    public static String[] chooseKingMoves(String kingLocation, String knightLocation, int n) {
        char[] x = new char[2];
        x[0] = kingLocation.charAt(0);
        char y = kingLocation.charAt(1);

        int dx = x[0] - (knightLocation.charAt(0) - 'a');
        int dy = y - (knightLocation.charAt(1) - '0');
        int d = dx + dy;

        String[] res = new String[n];
        x[1] = (char) (x[0] + 1);
        if (d % 2 == 0) y++;
        if (x[1] > 'h') x[1] -= 2;
        if (y > '8') y -= 2;

        for (int i = 0; i < n; i++) {
            res[i] = "" + x[(i + 1) % 2] + y;
        }

        return res;
    }
}
