namespace Solution {
  using NUnit.Framework;
  using System;

  [TestFixture]
  public class SolutionTest
  {
    [Test]
    public void MyTest()
    {
      Assert.AreEqual(5, Kata.SumNoDuplicates(new int[]{1,1,2,3}));
      Assert.AreEqual(3, Kata.SumNoDuplicates(new int[]{1,1,2,2,3}));
    }
  }
}
