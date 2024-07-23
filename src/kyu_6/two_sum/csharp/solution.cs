public class Kata
{
  public static int[] TwoSum(int[] numbers, int target)
  {
    for(int i = 0; i < numbers.Length - 1; i++)
    {
      for(int u = i + 1; u < numbers.Length; u++)
      {
        if(numbers[i] + numbers[u] == target)
          return new int[]{ i, u };
      }
    }
    return null;
  }
}