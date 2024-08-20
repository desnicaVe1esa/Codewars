using System;

public static class ReadySet
{
  public static string Spoonerize(string str)
  {
        string[] strings = str.Split(" ");
        string s1 = strings[1][0] + strings[0].Substring(1);
        string s2 = strings[0][0] + strings[1].Substring(1);
        return s1 + " " + s2;
  }
}