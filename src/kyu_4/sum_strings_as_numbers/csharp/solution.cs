using System;
using System.Numerics;

public static class Kata
{
    public static string sumStrings(string a, string b)
    {
      BigInteger.TryParse(a, out BigInteger a1);
      BigInteger.TryParse(b, out BigInteger b1);
      return (a1 + b1).ToString();
    }
}