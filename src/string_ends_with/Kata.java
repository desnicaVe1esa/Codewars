package string_ends_with;

// Проверяет, содержит ли первая входящая строка в конце вторую входящую строку

public class Kata {
    public static boolean solution(String str, String ending) {
        if (str.endsWith(ending)) {
            return true;
        } else {
            return false;
        }
    }
}
