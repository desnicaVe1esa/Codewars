package kyu_8.the_feast_of_many_beasts.java;

public class Kata {

    public static boolean feast(String beast, String dish) {
        char first = beast.charAt(0);
        char last = beast.charAt(beast.length() - 1);
        return dish.charAt(0) == first && dish.charAt(dish.length() - 1) == last;
    }
}
