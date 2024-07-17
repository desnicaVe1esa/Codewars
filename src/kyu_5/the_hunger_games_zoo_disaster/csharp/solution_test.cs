namespace Solution {
  using NUnit.Framework;
  using System;

  [TestFixture]
  public class SolutionTest
  {
    [Test]
    public void Example()
    {
        string input = "fox,bug,chicken,grass,sheep";
        string[] expected = {
          "fox,bug,chicken,grass,sheep",
          "chicken eats bug",
          "fox eats chicken",
          "sheep eats grass",
          "fox eats sheep",
          "fox"
        };

        Assert.AreEqual(expected, Dinglemouse.WhoEatsWho(input));
    }
  }
}