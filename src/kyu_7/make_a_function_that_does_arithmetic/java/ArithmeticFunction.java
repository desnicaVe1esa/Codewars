package kyu_7.make_a_function_that_does_arithmetic.java;

class ArithmeticFunction {
    public static int arithmetic(int a, int b, String operator) {
        int result = 0;
        switch (operator) {
            case "add" -> result =  a + b;
            case "subtract" -> result =  a - b;
            case "multiply" -> result =  a * b;
            case "divide" -> result =  a / b;
        }
        return result;
    }
}
