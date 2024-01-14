package kyu_3.battleship_field_validator;

public class BattleField {
    public static Integer check(int x, int y, int[][] field) {

        if ((x > 0) && (y < 9))
            if (field[x - 1][y + 1] == 1) return 5;
        if ((x < 9) && (y < 9)) {
            if (field[x + 1][y + 1] == 1) return 5;
            if ((field[x + 1][y] == 1) && (field[x][y + 1] == 1)) return 5;
        }
        if (y < 9)
            if (field[x][y + 1] == 1) return 1 + check(x, y + 1, field);

        if (x < 9)
            if (field[x + 1][y] == 1) return 1 + check(x + 1, y, field);

        return 1;
    }


    public static boolean fieldValidator(int[][] field) {
        int submarines = 0;
        int cruisers = 0;
        int destroyers = 0;
        int battleship = 0;
        for (int y = 0; y < 10; y++)
            for (int x = 0; x < 10; x++) {

                if (field[x][y] == 1) {
                    if ((x > 0) && (field[x - 1][y] == 1)) continue;
                    if ((y > 0) && (field[x][y - 1] == 1)) continue;

                    switch (check(x, y, field)) {
                        case 1 -> submarines++;
                        case 2 -> destroyers++;
                        case 3 -> cruisers++;
                        case 4 -> battleship++;
                        default -> {
                            return false;
                        }
                    }
                }
            }

        if (submarines != 4) return false;
        if (destroyers != 3) return false;
        if (cruisers != 2) return false;
        return battleship == 1;
    }
}
