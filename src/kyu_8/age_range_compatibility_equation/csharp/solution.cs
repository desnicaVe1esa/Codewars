public class Kata
{
  public static string DatingRange(int age)
  {
    return age <= 14 ? (int) (age - 0.1 * age) + "-" + (int) (age + 0.1 * age)
        : age / 2 + 7 + "-" + (age - 7) * 2;
  }
}