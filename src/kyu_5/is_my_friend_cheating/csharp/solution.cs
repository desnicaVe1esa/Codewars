using System;
using System.Collections.Generic;

public class RemovedNumbers {
	public static List<long[]> removNb(long n) {
        List<long[]> result = new List<long[]>();
        long sum = n * (n + 1) / 2;
        for (long i = 1; i <= n; i++) {
            long j = (sum - i) / (i + 1);
            if (j <= n && i * j == sum - i - j) {
                result.Add(new long[] {i, j});
            }
        }
        return result;
	}
}