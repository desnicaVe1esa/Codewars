namespace Solution {
  using NUnit.Framework;
  using System;

  [TestFixture]
  public class SolutionTest
  {
    [Test]
    public void SampleTest()
    {
      Assert.AreEqual("wide", Kata.MouthSize("toucan"));
      Assert.AreEqual("wide", Kata.MouthSize("ant bear"));
      Assert.AreEqual("small", Kata.MouthSize("alligator"));
    }
  }
}