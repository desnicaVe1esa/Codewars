using System;

public static class Kata
{
  public static string Leo(int oscar)
  {
    return oscar == 88 ? "Leo finally won the oscar! Leo is happy"
            : oscar == 86 ? "Not even for Wolf of wallstreet?!"
            : oscar < 88 && oscar != 86 ? "When will you give Leo an Oscar?"
            : "Leo got one already!";
  }
}