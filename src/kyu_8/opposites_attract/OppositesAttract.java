package kyu_8.opposites_attract;

// Функцию, которая возвращает true, если одно число четное, а второе нечетное. Иначе false

public class OppositesAttract {

    public static boolean isLove(final int flower1, final int flower2) {
        if (flower1 == 0 || flower2 == 0) {
            return true;
        }
        if (flower1 % 2 != 0 && flower2 % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
