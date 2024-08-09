package kyu_7.sum_of_numbers_from_0_to_n.java;

public class SequenceSum {

    public static String showSequence(int value) {
        if (value == 0) { return value + "=" + 0; }
        if (value < 0) { return value + "<" + 0; }
        StringBuilder expression = new StringBuilder();
        int result = 0;
        for (int i = 0; i <= value; i++) {
            expression.append(i).append("+");
            result += i;
        }
        return expression.substring(0, expression.length() - 1) + " = " + result;
    }
}
