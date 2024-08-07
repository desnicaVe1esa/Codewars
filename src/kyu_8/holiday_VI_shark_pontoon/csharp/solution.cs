public class Kata
{
  public static string Shark(int pontoonDistance, int sharkDistance, int yourSpeed, int sharkSpeed, bool dolphin)
  {
    return pontoonDistance * sharkSpeed < yourSpeed * sharkDistance * (dolphin ? 2 : 1)
      ? "Alive!"
      : "Shark Bait!";
  }
}