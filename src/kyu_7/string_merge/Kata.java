package kyu_7.string_merge;

// Возвращает комбинацию из двух слов

public class Kata {
    public static void main(String[] args) {
        System.out.println(stringMerge("hello", "world", 'l'));
    }

    public static String stringMerge(String s1, String s2, char letter) {
        return s1.substring(0, s1.indexOf(letter)) + s2.substring(s2.indexOf(letter));
    }
}
