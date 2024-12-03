package kyu_8.did_she_say_hallo.java;

public class Kata {

    public static boolean validateHello(String greetings) {
        return greetings.matches("(?i).*(hello|ciao|salut|hallo|hola|ahoj|czesc).*");
    }
}