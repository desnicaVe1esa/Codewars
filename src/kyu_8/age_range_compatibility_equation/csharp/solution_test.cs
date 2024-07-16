namespace Solution
{
  using NUnit.Framework;
  using System;

  [TestFixture]
  public class SolutionTest
  {
    [Test, Description("Example Test Cases")]
    public void Test()
    {
      Assert.AreEqual("15-20", Kata.DatingRange(17));
      Assert.AreEqual("27-66", Kata.DatingRange(40));
      Assert.AreEqual("14-16", Kata.DatingRange(15));
      Assert.AreEqual("24-56", Kata.DatingRange(35));
      Assert.AreEqual("9-11", Kata.DatingRange(10));
    }
  }
}