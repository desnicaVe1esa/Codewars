using System.Linq;

public class Kata
{
  public static double Billboard(string name, double price = 30)
  {
    return name.Sum(_ => price);
  }
}