public class Kata
{
  public static string WhatCentury(string year)
  {
        int century = int.Parse(year);
        if (century % 100 == 0) {
            century = century / 100;
        } else {
            century = (century / 100) + 1;
        }
        string postfix = "th";
        if (century % 10 == 1) {
            postfix = "st";
        }
        if (century % 10 == 2) {
            postfix = "nd";
        }
        if (century % 10 == 3) {
            postfix = "rd";
        }
        if (century > 10 && century <= 13) {
            postfix = "th";
        }

        return century + postfix;
  }
}