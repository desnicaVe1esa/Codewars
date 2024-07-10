using System.Collections.Generic;

namespace Code
{
  public class Unique
  {
    public static bool HasUniqueChars(string str)
    {
        HashSet<char> prepared = new HashSet<char>();
        for (int i = 0; i < str.Length; i++)
        {
            prepared.Add(str[i]);
        }
        return prepared.Count == str.Length;
    }
  }
}