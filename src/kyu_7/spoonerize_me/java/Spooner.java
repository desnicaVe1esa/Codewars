package kyu_7.spoonerize_me.java;

public class Spooner {
    public String spoonerize(String words) {
        String[] strings = words.split(" ");
        String s1 = strings[1].charAt(0) + strings[0].substring(1);
        String s2 = strings[0].charAt(0) + strings[1].substring(1);
        return s1 + " " + s2;
    }
}