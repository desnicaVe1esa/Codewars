package kyu_2.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MathEvaluator {

    public double calculate(String expression) {
        /* Проверка, что входящая строка не выражение */
        if (check(expression)) {
           return Double.parseDouble(expression);
        }

        double result = 0.0;

        List<String> parser = parse(expression);

        System.out.println(parser);

        for (int i = 0; i < parser.size(); i++) {
            if (parser.get(i).equals("+")) {
                result += Double.parseDouble(parser.get(i - 1)) + Double.parseDouble(parser.get(i + 1));
            } else if (parser.get(i).equals("-")) {
                result += Double.parseDouble(parser.get(i - 1)) - Double.parseDouble(parser.get(i + 1));
            } else if (parser.get(i).equals("*")) {
                result += Double.parseDouble(parser.get(i - 1)) * Double.parseDouble(parser.get(i + 1));
            } else if (parser.get(i).equals("/")) {
                result += Double.parseDouble(parser.get(i - 1)) / Double.parseDouble(parser.get(i + 1));
            }
        }
        return result;
    }

    public List<String> parse(String expression) {
        List<String> result = new ArrayList<>();

        /* Получение всех чисел из строки */
        List<String> digits = new ArrayList<>();
        Pattern pattern = Pattern.compile("-?([0-9]*[.])?[0-9]+");
        Matcher matcher = pattern.matcher(expression);
        while (matcher.find()) {
            String digit = matcher.group();
            digits.add(digit);
        }

        /* Получение всех знаков математических операций из строки */
        List<String> operators =
                Arrays.stream(expression.replaceAll("-?([0-9]*[.])?[0-9]+", "")
                        .split(""))
                        .filter(f -> !f.equals(" "))
                        .toList();

        /* Объединение в общую коллекцию для подготовки к вычислениям */
        for (int i = 0; i < digits.size(); i++) {
            result.add(digits.get(i));
            if (i < operators.size()) {
                result.add(operators.get(i));
            }
        }

        return result;
    }

    public boolean check(String expression) {
        Pattern pattern = Pattern.compile("^[+-]?([0-9]*[.])?[0-9]+$");
        Matcher matcher = pattern.matcher(expression);
        return matcher.find();
    }
}
