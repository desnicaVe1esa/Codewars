using System.Linq;

class Kata
{
    public static int MaxTriSum(int[] a) => a.Distinct().OrderByDescending(x => x).Take(3).Sum();
}