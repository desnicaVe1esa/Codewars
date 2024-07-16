public class Kata
{
    public static int MaxMultiply(int divisor, int bound)
    {
        return bound - bound % divisor;
    }
}