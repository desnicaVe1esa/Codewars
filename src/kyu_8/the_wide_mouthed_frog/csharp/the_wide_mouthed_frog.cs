public class Kata
{
  public static string MouthSize(string animal)
  {
    return animal.ToLower().Equals("alligator") ? "small" : "wide";
  }
}