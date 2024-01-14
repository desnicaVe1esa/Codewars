package kyu_7.build_a_square;

// Принимает число и возвращает фигуру такой же длины и ширины, как целое число

public class Kata {
    public static void main(String[] args) {
        System.out.println(generateShape(3));
    }

    public static final String generateShape(int n) {
        if (n <= 0) {
            return new String();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                sb.append("+");
            }
            sb.append("\n");
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }
}
