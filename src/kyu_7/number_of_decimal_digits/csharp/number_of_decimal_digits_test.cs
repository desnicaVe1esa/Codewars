namespace Solution {
  using NUnit.Framework;
  using System;

  [TestFixture]
  public class SampleTests
  {
    [Test]
    public void Digits()
    {
      Assert.AreEqual(1,DecTools.Digits(5ul));
      Assert.AreEqual(5,DecTools.Digits(12345ul));
      Assert.AreEqual(10,DecTools.Digits(9876543210ul));
    }
  }
}
