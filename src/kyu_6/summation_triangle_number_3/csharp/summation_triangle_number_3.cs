using System;

public static class Kata {
  public static long GetSum(int n) {
        long p = n >> 1;
        long q = n % 2;
        return -(p + 2 * q - 1) * (p + q + 1) * (p + q + 1);
  }
}