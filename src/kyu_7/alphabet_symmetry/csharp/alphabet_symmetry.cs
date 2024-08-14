using System;
using System.Collections.Generic;

public static class Kata
{
    public static List<int> Solve(List<string> arr)
    {
        var result = new List<int>();
        foreach (var item in arr)
        {
            result.Add(GetCorrectPosition(item.ToLower()));
        }
        return result;
    }

    public static int GetCorrectPosition(string letters)
    {
        int result = 0;
        for (int i = 0; i < letters.Length; i++)
        {
            if (i == letters[i] - 'a')
            {
                result++;
            }
        }
        return result;
    }
}