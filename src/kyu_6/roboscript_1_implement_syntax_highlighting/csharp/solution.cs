using System.Text.RegularExpressions;

public class Syntax
{
  public static string Highlight(string code)
  {
    code = new Regex("(F+)").Replace(code, "<span style=\"color: pink\">$1</span>");
    code = new Regex("(L+)").Replace(code, "<span style=\"color: red\">$1</span>");
    code = new Regex("(R+)").Replace(code, "<span style=\"color: green\">$1</span>");
    code = new Regex(@"(\d+)").Replace(code, "<span style=\"color: orange\">$1</span>");
    return code;
  }
}