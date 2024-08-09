public class SequenceSum
{
  public static string ShowSequence(int n)
  {
        if (n == 0) { return n + "=" + 0; }
        if (n < 0) { return n + "<" + 0; }
        string expression = "";
        int result = 0;
        for (int i = 0; i <= n; i++) {
            expression += i + "+";
            result += i;
        }
        return expression.Substring(0, expression.Length - 1) + " = " + result;
  }
}