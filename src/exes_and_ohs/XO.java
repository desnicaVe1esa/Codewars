package exes_and_ohs;

// Проверить, содержит ли строка одинаковое количество "x" и "o".
// Метод должен возвращать логическое значение и быть нечувствительным к регистру.
// Строка может содержать любой символ.

public class XO {
    public static boolean getXO (String str) {
        char[] arr = str.toLowerCase().toCharArray();
        int countX = 0;
        int countO = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'x') countX++;
            else if (arr[i] == 'o') countO++;
            else if (arr[i] != 'x' && arr[i] != 'o') continue;
        }
        return countX == countO;
    }
}