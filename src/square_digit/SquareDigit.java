package square_digit;

// Разбить число на цифры, возвести каждую цифру в квадрат

public class SquareDigit {

    public static void main(String[] args) {
        SquareDigit squareDigit = new SquareDigit();
        System.out.println(squareDigit.squareDigits(5520));
    }

    public static int squareDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            StringBuilder res = new StringBuilder();
            while (n != 0) {
                int rem = n % 10;
                res.insert(0, rem * rem);
                n = n / 10;
            }
            return Integer.parseInt(res.toString());
        }
    }
}
