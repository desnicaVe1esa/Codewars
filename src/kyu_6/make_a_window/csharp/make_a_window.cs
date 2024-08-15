using System;
using System.Linq;

static class Kata
{
    public static string MakeAWindow(int n)
    {
      var win = "|" + new string('.', n) + "|" + new string('.', n) + "|" + "\n";
      var middle = "|" + new string('-', n) + "+" + new string('-', n) + "|" + "\n";
      var topBottom = new string('-', win.Length-1) + "\n";
      return (topBottom + string.Concat(Enumerable.Range(0, n).Select(x => win)) + middle + string.Concat(Enumerable.Range(0, n).Select(x => win)) + topBottom).Trim('\n');
    }
}