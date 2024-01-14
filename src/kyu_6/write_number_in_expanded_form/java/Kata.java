package kyu_6.write_number_in_expanded_form.java;

public class Kata {
    public static String expandedForm(int num) {
        String expandedForm = "";
        String numStr = String.valueOf(num);

        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            int power = numStr.length() - i - 1;

            if (digit != 0) {
                int expandedDigit = digit * (int) Math.pow(10, power);
                expandedForm += expandedDigit + " + ";
            }
        }

        expandedForm = expandedForm.substring(0, expandedForm.length() - 3);
        return expandedForm;
    }
}
