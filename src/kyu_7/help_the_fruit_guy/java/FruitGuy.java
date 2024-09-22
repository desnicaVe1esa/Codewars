package kyu_7.help_the_fruit_guy.java;

public class FruitGuy {

    public static String[] removeRotten(String[] fruitBasket) {
        if (fruitBasket == null) {
            return new String[]{};
        }
        String[] result = new String[fruitBasket.length];
        for (int i = 0; i < fruitBasket.length; i++) {
            if (fruitBasket[i].contains("rotten")) {
                result[i] = fruitBasket[i].toLowerCase().substring(6);
            } else {
                result[i] = fruitBasket[i];
            }
        }
        return result;
    }
}
