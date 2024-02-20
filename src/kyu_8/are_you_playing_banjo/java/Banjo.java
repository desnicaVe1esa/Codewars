package kyu_8.are_you_playing_banjo.java;

public class Banjo {
    public static String areYouPlayingBanjo(String name) {
       return name.toLowerCase().charAt(0) == 'r' ?
               name.substring(0) + " plays banjo" :
               name.substring(0) + " does not play banjo";
    }
}