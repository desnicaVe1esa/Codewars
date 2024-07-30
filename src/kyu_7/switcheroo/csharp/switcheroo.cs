public class Kata
{
  public static string Switcheroo(string x)
  {
        string result = "";
        for (int i = 0; i < x.Length; i++)
        {
            result += x[i] == 'a' ? "b"
                         : x[i] == 'b' ? "a"
                         : x[i];
        }
        return result;
  }
}