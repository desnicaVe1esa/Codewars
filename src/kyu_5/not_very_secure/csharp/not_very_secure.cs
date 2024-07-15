using System.Linq;

public class Kata
{
  public static bool Alphanumeric(string str)
  {
      return str.Length != 0 &&
      str.Count(x => char.IsDigit(x)) + str.Count(x => char.IsLetter(x)) == str.Length;
  }
}