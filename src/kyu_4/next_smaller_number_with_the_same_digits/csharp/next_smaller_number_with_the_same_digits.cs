using System;
using System.Linq;

public class Kata
{
  public static long NextSmaller(long n)
  {
    var chars = n.ToString();
    for (var i = chars.Length - 1; i > 0; i--)
    {
      if (chars[i] < chars[i - 1])
      {
        var right = chars.Skip(i).ToArray();
        var next = right.Where(a => a < chars[i - 1]).Max();
        right[Array.IndexOf(right, next)] = chars[i - 1];        
        var answer = chars.Substring(0, i - 1) + next + string.Concat(right.OrderByDescending(a => a));
        return answer[0] == '0' ? -1 : long.Parse(answer);
      }
    }    
    return -1;
  }
}