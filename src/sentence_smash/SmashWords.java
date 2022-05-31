package sentence_smash;

// Соединяет слова в предложение

public class SmashWords {

    public static void main(String[] args) {
        String[] s = {"hello", "world", "this", "is", "great"};
        System.out.println(smash(s));
    }

    public static String smash(String... words) {
        return String.join(" ", words);
    }
}
