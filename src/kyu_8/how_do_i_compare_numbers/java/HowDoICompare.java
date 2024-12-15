package kyu_8.how_do_i_compare_numbers.java;

public class HowDoICompare {

    public static String whatIs(Integer x) {
        if (x == 42) {
            return "everything";
        } else if (x == 42 * 42) {
            return "everything squared";
        } else {
            return "nothing";
        }
    }
}
