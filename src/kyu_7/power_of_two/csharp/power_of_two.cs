using System;

public static class Kata
{
  public static bool PowerOfTwo(int n)
  {
    return n > 0 && (n & (n - 1)) == 0;
  }
}