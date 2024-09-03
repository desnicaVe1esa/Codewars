using System;
using System.Text.RegularExpressions;

public class Kata
{
  public static string Remove(string s)
  {
    return s.Replace("!", "") + "!";
  }
}