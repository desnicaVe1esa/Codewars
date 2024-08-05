using System;

class Kata
{
    public static int MinSum(int[] a)
    {
        int result = 0;
        Array.Sort(a);
        for (int i = 0, j = a.Length - 1; i < a.Length; i += 2, j -= 2) {
            result += a[j] * a[i];
        }
        return result;
    }
}