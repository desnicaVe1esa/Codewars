package find_the_next_perfect_square.java;

public class NumberFun {
    public static long findNextSquare(long sq) {
        if (Math.sqrt(sq) % 1 != 0) {
            return -1;
        }
        long result = (long) (Math.sqrt(sq) + 1);
        return result * result;
    }
}
