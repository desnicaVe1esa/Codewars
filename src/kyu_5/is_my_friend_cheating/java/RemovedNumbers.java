package kyu_5.is_my_friend_cheating.java;

import java.util.List;
import java.util.ArrayList;

public class RemovedNumbers {

    public static List<long[]> removNb(long n) {
        List<long[]> result = new ArrayList<long[]>();
        long sum = n * (n + 1) / 2;
        for (long i = 1; i <= n; i++) {
            long j = (sum - i) / (i + 1);
            if (j <= n && i * j == sum - i - j) {
                result.add(new long[] {i, j});
            }
        }
        return result;
    }
}
