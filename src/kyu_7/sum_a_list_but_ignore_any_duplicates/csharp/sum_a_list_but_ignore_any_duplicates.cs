using System.Linq;

public class Kata
{
  public static int SumNoDuplicates(int[] arr)
  {
    return arr.Sum(s => arr.Count(c => c == s) == 1 ? s : 0);
  }
}