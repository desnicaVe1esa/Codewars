using System;

namespace Extensions
{
  public static class StringExt
  {
    public static string ToAlternatingCase (this string s)
    {
        string result = "";
        foreach (char c in s.ToCharArray())
        {
            if(Char.IsUpper(c))
            {
                result += Char.ToLower(c);
            } else {
                result += Char.ToUpper(c);
            }
        }
        return result;
    }
  }
}