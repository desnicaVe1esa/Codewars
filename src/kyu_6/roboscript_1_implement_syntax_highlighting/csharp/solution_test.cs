namespace RoboScript {
  using NUnit.Framework;
  using System;

  [TestFixture]
  public class SyntaxHighlighter
  {
    [Test, Description("should work for the examples provided in the description")]
    public void SampleTest()
    {
      Console.WriteLine("Code without syntax highlighting: F3RF5LF7");
      Console.WriteLine("Your code with syntax highlighting: " + Syntax.Highlight("F3RF5LF7"));
      Console.WriteLine("Expected syntax highlighting: <span style=\"color: pink\">F</span><span style=\"color: orange\">3</span><span style=\"color: green\">R</span><span style=\"color: pink\">F</span><span style=\"color: orange\">5</span><span style=\"color: red\">L</span><span style=\"color: pink\">F</span><span style=\"color: orange\">7</span>");
      Assert.AreEqual("<span style=\"color: pink\">F</span><span style=\"color: orange\">3</span><span style=\"color: green\">R</span><span style=\"color: pink\">F</span><span style=\"color: orange\">5</span><span style=\"color: red\">L</span><span style=\"color: pink\">F</span><span style=\"color: orange\">7</span>", Syntax.Highlight("F3RF5LF7"));
      Console.WriteLine("Code without syntax highlighting: FFFR345F2LL");
      Console.WriteLine("Your code with syntax highlighting: " + Syntax.Highlight("FFFR345F2LL"));
      Console.WriteLine("Expected syntax highlighting: <span style=\"color: pink\">FFF</span><span style=\"color: green\">R</span><span style=\"color: orange\">345</span><span style=\"color: pink\">F</span><span style=\"color: orange\">2</span><span style=\"color: red\">LL</span>");
      Assert.AreEqual("<span style=\"color: pink\">FFF</span><span style=\"color: green\">R</span><span style=\"color: orange\">345</span><span style=\"color: pink\">F</span><span style=\"color: orange\">2</span><span style=\"color: red\">LL</span>", Syntax.Highlight("FFFR345F2LL"));
    }
  }
}