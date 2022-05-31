package stringy_sntrings;

// Принимает число-размер строки и выводит строку с чередованием единицы и нуля

public class Kata {
    public static void main(String[] args) {
        System.out.println(stringy(12));
    }

    public static String stringy(int size) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size; i++){
            if (i % 2 ==0) {
                builder.append(1);
            } else {
                builder.append(0);
            }
        }
        return builder.toString();
    }
}
