using System;

public class Kata
{
  public static bool All(int[] arr, Func<int, bool> fun)
  {
        foreach (int j in arr)
        {
            if (!fun(j))
            {
                return false;
            }
        }
        return true;
  }
}