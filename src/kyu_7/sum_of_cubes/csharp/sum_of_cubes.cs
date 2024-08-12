using System;

public static class Kata
{
  public static long SumCubes(int n)
  {
        long result = 0;
        for (long i = 1; i <= n; i++) {
            result += i * i * i;
        }
        return result;
  }
}