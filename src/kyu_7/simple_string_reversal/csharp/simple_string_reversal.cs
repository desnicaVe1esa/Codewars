public class Solution
{
    public static string solve(string s)
    {
        var a = s.ToCharArray();

        for (int i = 0, j = s.Length-1; j >= 0; i++, j--)
        {
          if (s[i] == ' ') i++;
          if (s[j] == ' ') j--;
          a[i] = s[j];
        }

        return new string(a);
    }
}