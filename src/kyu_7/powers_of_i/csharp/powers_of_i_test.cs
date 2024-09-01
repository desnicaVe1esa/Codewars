namespace Solution {
  using NUnit.Framework;
  using System;

  [TestFixture]
  public class SolutionTest
  {
    [Test]
    public void SampleTest()
    {
      int i = 4;
      Assert.AreEqual("1", Kata.Pofi(0));
      Assert.AreEqual("i", Kata.Pofi(1));
      Assert.AreEqual("-1", Kata.Pofi(2));
      Assert.AreEqual("-i", Kata.Pofi(3));
      Assert.AreEqual("1", Kata.Pofi(i));
      Assert.AreEqual("i", Kata.Pofi(i+1));
      Assert.AreEqual("-1", Kata.Pofi(i+2));
      Assert.AreEqual("-i", Kata.Pofi(i+3));
      i+= 4;
      Assert.AreEqual("1", Kata.Pofi(i));
      Assert.AreEqual("i", Kata.Pofi(i+1));
      Assert.AreEqual("-1", Kata.Pofi(i+2));
      Assert.AreEqual("-i", Kata.Pofi(i+3));
    }
  }
}
