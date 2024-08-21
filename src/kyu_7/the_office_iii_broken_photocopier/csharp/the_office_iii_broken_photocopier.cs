public class Kata
{
  public static string Broken(string x)
  {
    string result = "";
    for (int i = 0; i < x.Length; i++) {
      result += x[i] == '0' ? "1" : "0";
    }
    return result;
  }
}