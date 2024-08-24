using System.Linq;

public static class Kata
{
  public static string CountSheep(int n)
  {
    return string.Concat(Enumerable.Range(1, n).Select(i => $"{i} sheep..."));
  }
}