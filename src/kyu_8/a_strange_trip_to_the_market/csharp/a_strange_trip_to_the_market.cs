public static class Kata 
{
  public static bool IsLockNessMonster(string sentence) 
  {
    return sentence.ToLower().Contains("tree fiddy") || sentence.ToLower().Contains("$3.50");
  }
}
