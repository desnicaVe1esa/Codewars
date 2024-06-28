using System;

public class MaxDiffLength
{
    public static int Mxdiflg(string[] a1, string[] a2)
    {
        int result = -1;
            for (int i = 0; i < a1.Length; i++)
            {
                for (int j = 0; j < a2.Length; j++)
                {
                    int currentMax = Math.Abs(a1[i].Length - a2[j].Length);
                    if (currentMax > result)
                    {
                        result = currentMax;
                    }
                }
            }
            return result;
    }
}