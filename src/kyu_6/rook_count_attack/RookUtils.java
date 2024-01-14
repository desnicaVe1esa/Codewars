package kyu_6.rook_count_attack;

// Рассчитывает количество атак ладий, расположенных на шахматной доске
public class RookUtils {
    public static int countAttackingRooks(int[][] rooks) {
        int count = 0;
        int[] horizontal = new int[8];
        int[] vertical = new int[8];
        for (int[] rook : rooks) {
            horizontal[rook[0]]++;
            vertical[rook[1]]++;
        }
        for (int i = 0; i < 8; i++)
            count += Math.max(horizontal[i] - 1, 0) + Math.max(vertical[i] - 1, 0);
        return count;
    }
}
