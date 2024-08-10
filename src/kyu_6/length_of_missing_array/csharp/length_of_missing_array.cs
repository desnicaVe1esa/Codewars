using System;
using System.Linq;

public class Kata
{
  public static int GetLengthOfMissingArray(object[][] arrayOfArrays)
  {
    if(arrayOfArrays == null || arrayOfArrays.Length == 0)
    {
      return 0;
    }

    if(arrayOfArrays.Any(a => a == null || a.Length == 0))
    {
      return 0;
    }

    var OrderedLengths = arrayOfArrays.Select(a => a.Length).OrderBy(l => l);

    return Enumerable.Range(OrderedLengths.First(), OrderedLengths.Last() - OrderedLengths.First() + 1).Sum() - OrderedLengths.Sum();
  }
}