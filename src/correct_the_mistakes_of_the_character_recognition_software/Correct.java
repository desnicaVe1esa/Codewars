package correct_the_mistakes_of_the_character_recognition_software;

public class Correct {
    public static String correct(String string) {
        return string.replace('1', 'I').replace('0', 'O').replace('5', 'S');
    }
}
