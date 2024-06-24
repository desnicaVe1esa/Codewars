package kyu_8.training_js_number_7_if_dot_else_and_ternary_operator.java;


public class SaleHotdogs {
    public static int saleHotdogs(final int n) {
        return n < 5 ? n * 100 : n < 10 ? n * 95 : n * 90;
    }
}