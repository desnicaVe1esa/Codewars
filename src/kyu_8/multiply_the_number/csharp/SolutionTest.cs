namespace Solution {
  using NUnit.Framework;
  using System;

  [TestFixture]
  public class SolutionTest
  {
    [Test, Description("Basic Tests")]
    public void SampleTest()
    {
      Assert.AreEqual(250, Kata.Multiply(10));
      Assert.AreEqual(25, Kata.Multiply(5));
      Assert.AreEqual(25000, Kata.Multiply(200));
      Assert.AreEqual(0, Kata.Multiply(0));
      Assert.AreEqual(-10, Kata.Multiply(-2));
    }
  }
}