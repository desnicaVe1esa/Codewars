package kyu_6.reverse_polish_notation_calculator.java;

import java.util.Arrays;
import java.util.Objects;

public class Calc {

  public double evaluate(String expr) {
    if (expr.matches("-?\\d+(\\.\\d+)?")) {
      return Double.parseDouble(expr);
    }
    String[] items = expr.split(" ");
    double result = 0.0;
    for (int i = 0; i < items.length; i++) {
      switch (items[i]) {
        case "*" -> {
          result = Double.parseDouble(items[i - 2]) * Double.parseDouble(items[i - 1]);
          items = minusThree(items, i, i - 1, i - 2, result);
          i = 0;
        }
        case "/" -> {
          result = Double.parseDouble(items[i - 2]) / Double.parseDouble(items[i - 1]);
          items = minusThree(items, i, i - 1, i - 2, result);
          i = 0;
        }
        case "+" -> {
          result = Double.parseDouble(items[i - 2]) + Double.parseDouble(items[i - 1]);
          items = minusThree(items, i, i - 1, i - 2, result);
          i = 0;
        }
        case "-" -> {
          result = Double.parseDouble(items[i - 2]) - Double.parseDouble(items[i - 1]);
          items = minusThree(items, i, i - 1, i - 2, result);
          i = 0;
        }
      }
    }
    return result;
  }

  public String[] minusThree(String[] items, int index1, int index2, int index3, double result) {
    items[index1] = null;
    items[index2] = null;
    items[index3] = String.valueOf(result);
    return Arrays.stream(items).filter(Objects::nonNull).toArray(String[]::new);
  }
}