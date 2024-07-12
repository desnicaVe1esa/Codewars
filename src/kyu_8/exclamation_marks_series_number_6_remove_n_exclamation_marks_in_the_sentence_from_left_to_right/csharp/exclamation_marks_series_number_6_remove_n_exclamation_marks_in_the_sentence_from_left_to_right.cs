public class Kata
{
  public static string Remove(string s, int n)
  {
        string result = "";
        char[] chars = s.ToCharArray();
        for (int i = 0; i < chars.Length; i++) {
            if (chars[i] == '!' && n != 0) {
                chars[i] = '@';
                n--;
            }
            result += chars[i] + "";
        }

        return result.ToString().Replace("@", "");
  }
}