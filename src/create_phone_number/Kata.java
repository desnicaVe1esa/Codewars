package create_phone_number;

// Записать массив интов как номер телефона

public class Kata {

    public static void main(String[] args) {
        int[] i = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(createPhoneNumber(i));
    }

    public static String createPhoneNumber(int[] numbers) {
        String s = "(";
        for (int i = 0; i < numbers.length; i++) {
            s += numbers[i] + "";
            if (i == 2) {
                s += ") ";
            }
            if (i == 5) {
                s += "-";
            }
        }
        return s;
    }
}
