package kyu_7.basic_calculator.java;

public class Calculator {
    public static Double calculate(final double numberOne, final String operation, final double numberTwo) {
        Double Result;
        switch (operation) {
            case "+" -> Result = numberOne + numberTwo;
            case "-" -> Result = numberOne - numberTwo;
            case "*" -> Result = numberTwo == 0 && numberOne < 0 ?
                    Math.abs(numberOne * numberTwo) :
                    (numberOne * numberTwo);
            case "/" -> Result = numberTwo == 0 ?  null : numberOne / numberTwo;
            default -> {
                return null;
            }
        }
        return Result;
    }
}
