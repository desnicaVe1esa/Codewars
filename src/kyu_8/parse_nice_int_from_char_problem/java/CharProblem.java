package kyu_8.parse_nice_int_from_char_problem.java;

public class CharProblem {
    public static int howOld(final String herOld) {
        return Integer.parseInt(herOld.replaceAll("\\D+", ""));
    }
}
