package kyu_8.tip_calculator.java;

public class TipCalculator {

    public static Integer calculateTip(double amount, String rating) {
        double result;

        switch (rating.toLowerCase()) {
            case "terrible" -> { result = 0; }
            case "poor" -> { result =  Math.ceil(amount / 100 * 5); }
            case "good" -> { result =  Math.ceil(amount / 100 * 10); }
            case "great" -> { result =  Math.ceil(amount / 100 * 15); }
            case "excellent" -> { result =  Math.ceil(amount / 100 * 20); }
            default -> {
                return null;
            }
        }

        return (int) result;
    }
}