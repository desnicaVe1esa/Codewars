using System.Collections.Generic;
using System.Linq;
using System;

public class Decompose {

  public string decompose(long n) {
      long goal = 0;
      var result = new Stack<long>();
      result.Push(n);
      while (result.Count > 0)
      {
          long current = result.Pop();
          goal += current * current;
          for (long i = current - 1; i > 0; i--)
          {
              if (goal - (i * i) >= 0 && !result.Contains(i))
              {
                  goal -= i * i;
                  result.Push(i);
                  if (goal == 0)
                  {
                      var ar = result.OrderBy(x => x).ToArray();
                      return string.Join(" ", ar);
                  }
              }
          }
      }
      return null;
  }
}