using System;
public class PerfectPower
{
    public static (int, int)? IsPerfectPower(int n)
    {
        for (int i = 2; ; i++)
        {
        int root = (int) Math.Round(Math.Pow(n, 1.0 / i));
        if (root < 2) return null;
        if (Math.Pow(root, i) == n) return new (root, i);
        }
    }
}