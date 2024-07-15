public class Kata
{
  public static uint Hotpo(uint n)
  {
    return n == 1 ? 0 : n % 2 == 0 ? Hotpo(n / 2) + 1 : Hotpo(3 * n + 1) + 1;
  }
}