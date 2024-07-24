using System.Linq;
class Kata
{
    public static int NthSmallest(int[] xs, int pos) => xs.OrderBy(x => x).ElementAt(pos - 1);
}