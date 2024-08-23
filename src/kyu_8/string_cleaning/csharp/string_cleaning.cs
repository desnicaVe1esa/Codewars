using System.Text.RegularExpressions;

public class Kata
{
  public static string StringClean(string s)
  {
    return Regex.Replace(s, @"\d", "");
  }
}