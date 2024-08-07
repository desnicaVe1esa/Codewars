package kyu_2.evaluate_mathematical_expression.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MathEvaluator {

    private final Pattern parens = Pattern.compile("(-?)\\(([^()]+)\\)");
    private final Pattern divMul = Pattern.compile("(-?[0-9.]+)\\s*([/*])\\s*(-?[0-9.]+)");
    private final Pattern addSub = Pattern.compile("(-?[0-9.]+)\\s*([+\\-])\\s*(-?[0-9.]+)");

    public double calculate(String expression) {
        Matcher m;
        while ((m = parens.matcher(expression)).find()) {
            String eval = evaluate(m.group(2));
            if (!m.group(1).isEmpty())
                eval = eval.startsWith("-") ? eval.substring(1) : "-" + eval;
            expression = expression.substring(0, m.start()) + eval + expression.substring(m.end());
        }
        return Double.parseDouble(evaluate(expression));
    }

    private String evaluate(String expression) {
        Matcher m;
        while ((m = divMul.matcher(expression)).find()) {
            double x = Double.parseDouble(m.group(1));
            double y = Double.parseDouble(m.group(3));
            double v = m.group(2).equals("*") ? x * y : x / y;
            expression = expression.substring(0, m.start()) + v + expression.substring(m.end());
        }
        while ((m = addSub.matcher(expression)).find()) {
            double x = Double.parseDouble(m.group(1));
            double y = Double.parseDouble(m.group(3));
            double v = m.group(2).equals("+") ? x + y : x - y;
            expression = expression.substring(0, m.start()) + v + expression.substring(m.end());
        }
        return expression;
    }

}
