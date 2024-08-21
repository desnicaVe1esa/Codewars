namespace Solution
{
  using NUnit.Framework;
  using System;

  [TestFixture]
  public class KataTests
  {
    [Test]
    public void BasicTests()
    {
      Assert.AreEqual("0", Kata.Broken("1"));
      Assert.AreEqual("01111111010010000001100110111", Kata.Broken("10000000101101111110011001000"));
      Assert.AreEqual("011101", Kata.Broken("100010"));
    }
  }
}