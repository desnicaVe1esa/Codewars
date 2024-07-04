using System;

public class Kata
{
  public static string SortGiftCode(string code)
  {
      char[] chars = code.ToCharArray();
      Array.Sort(chars);
      return new string(chars);
  }
}