package kyu_7.shorter_concat_reverse_longer.java;

public class ReverseLonger {

    public static String shorterReverseLonger(String a, String b) {
        StringBuilder longer = new StringBuilder();
        StringBuilder shorter = new StringBuilder();

        if (a.length() >= b.length()) {
            longer.append(a);
        } else {
            longer.append(b);
        }

        if (a.length() < b.length()) {
            shorter.append(a);
        } else {
            shorter.append(b);
        }

        return shorter.toString() + longer.reverse() + shorter;
    }
}
