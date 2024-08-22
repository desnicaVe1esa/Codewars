using System.Collections.Generic;
using System.Linq;

public static class Kata
{
  public static IEnumerable<string> MyLanguages(Dictionary<string, int> results)
  {
    return results.Where(x => x.Value >= 60).OrderByDescending(x => x.Value).Select(x => x.Key);
  }
}