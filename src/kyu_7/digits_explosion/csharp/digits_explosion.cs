using System;
using System.Linq;

public class Digits
{
  public static string Explode(string s)
  {
    return string.Join("", s.Select(c => new String(c, int.Parse(c.ToString()))));
  }
}