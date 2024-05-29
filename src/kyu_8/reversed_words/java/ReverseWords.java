package kyu_8.reversed_words.java;

public class ReverseWords {

    public static String reverseWords(String str) {
        String[] arr = str.split(" ");
        String result = "";
        for (int i = arr.length - 1;  i >= 0; i--) {
            result += arr[i] + " ";
        }
        return result.trim();
    }
}