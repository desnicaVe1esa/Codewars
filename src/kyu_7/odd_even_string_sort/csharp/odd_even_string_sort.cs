using System;
using System.Text;

public class Kata
{
    public static string SortMyString(string s)
    {
        StringBuilder result = new StringBuilder();
        result.Append(Even(s)).Append(" ").Append(Odd(s));
        return result.ToString();
    }

    /* Получает все четные буквы */
    public static string Even(string s) {
        StringBuilder evens = new StringBuilder();
        for (int i = 0; i < s.Length; i++) {
            if (i % 2 == 0) {
                evens.Append(s[i]);
            }
        }
        return evens.ToString();
    }

    /* Получает все нечетные буквы */
    public static string Odd(string s) {
        StringBuilder odds = new StringBuilder();
        for (int i = 0; i < s.Length; i++) {
            if (i % 2 != 0) {
                odds.Append(s[i]);
            }
        }
        return odds.ToString();
    }
}