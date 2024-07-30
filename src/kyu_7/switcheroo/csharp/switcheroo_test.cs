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
      Assert.AreEqual("bac", Kata.Switcheroo("abc"));
      Assert.AreEqual("bbbacccabbb", Kata.Switcheroo("aaabcccbaaa"));
      Assert.AreEqual("ccccc", Kata.Switcheroo("ccccc"));
    }
  }
}