using System.Linq;

public class solution
{
  public bool validate(string n)
  {

    return n.Select( c => (int) char.GetNumericValue(c) )
      .Where( x => x != -1)
      .Reverse()
      .Select( (x, i) => ( i % 2 == 1 ) ? 2 * x : x )
      .Select( x => ( x > 9 ) ? x - 9 : x )
      .Sum() % 10 == 0;
  }
}