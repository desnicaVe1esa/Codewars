package kyu_7.alphabet_war.java;

public class Kata{
    public static String alphabetWar(String fight){
        int result = 0;
        char[] chars = fight.toCharArray();
        for (char c: chars) {
            switch (c) {
                case 'w' -> result += 4;
                case 'p' -> result += 3;
                case 'b' -> result += 2;
                case 's' -> result += 1;
                case 'm' -> result -= 4;
                case 'q' -> result -= 3;
                case 'd' -> result -= 2;
                case 'z' -> result -= 1;
            }
        }
        if (result == 0) {
            return "Let's fight again!";
        } else {
            return result > 0 ? "Left side wins!" : "Right side wins!";
        }
    }
}