package get_the_middle_character;

// Если входящая строка одержит четное количество символов, то выводит две буквы из центра,
// а если нечетное, то одну

public class Kata {

    public static String getMiddle(String word) {
        String result = "";
        if (word.length() % 2 == 0) {
            for (int i = 0; i < word.length(); i++) {
                result = word.substring((word.length() / 2) - 1, (word.length() / 2) + 1);
            }
        } else {
            result = word.substring((word.length() / 2), (word.length() / 2) + 1);
        }
        return result;
    }
}
