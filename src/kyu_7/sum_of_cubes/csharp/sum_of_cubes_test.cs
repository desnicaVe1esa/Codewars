namespace Solution 
{
  using NUnit.Framework;
  using System;

  [TestFixture]
  public class SolutionTest
  {
    [Test, Description("Sample Tests")]
    public void SampleTest()
    {
      Assert.AreEqual(1, Kata.SumCubes(1));
      Assert.AreEqual(9, Kata.SumCubes(2));
      Assert.AreEqual(36, Kata.SumCubes(3));
      Assert.AreEqual(100, Kata.SumCubes(4));
      Assert.AreEqual(3025, Kata.SumCubes(10));
      Assert.AreEqual(58155876, Kata.SumCubes(123));
    }
  }
}