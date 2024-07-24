using System;
using System.Linq;

public class Revrot
{
    public static string RevRot(string strng, int sz)
    {
        if (String.IsNullOrEmpty(strng) || sz <= 0 || sz > strng.Length)
            return String.Empty;

        return
            new String(
                Enumerable.Range(0, strng.Length/sz)
                    .Select(i => strng.Substring(i*sz, sz))
                    .Select(
                        chunk =>
                            chunk.Sum(digit => (int) Math.Pow(int.Parse(digit.ToString()), 3))%2 == 0
                                ? chunk.Reverse()
                                : chunk.Skip(1).Concat(chunk.Take(1)))
                    .SelectMany(x => x)
                    .ToArray());
    }
}