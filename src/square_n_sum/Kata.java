package square_n_sum;

// Принимает массив и возводит в квадрат каждое переданное число, а затем суммирует результаты вместе

public class Kata {
    public static void main(String[] args) {
        int[] array = {1, 2, 2};
        System.out.println(squareSum(array));
    }

    public static int squareSum(int[] n) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            n[i] = (int) Math.pow(n[i], 2);
            sum += n[i];
        }
        return sum;
    }
}
