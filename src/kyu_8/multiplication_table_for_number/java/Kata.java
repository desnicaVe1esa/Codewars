package kyu_8.multiplication_table_for_number.java;

public class Kata {
    public static String multiTable(int num) {
        int count = 1;
        StringBuilder result = new StringBuilder();
        while (count <= 10) {
            result.append(count).append(" * ").append(num).append(" = ").append(count * num).append("\n");
            count++;
        }
        return result.toString().trim();
    }
}