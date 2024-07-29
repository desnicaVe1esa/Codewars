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
      Assert.AreEqual(-1, Kata.CloseCompare(4, 5));
      Assert.AreEqual(0, Kata.CloseCompare(5, 5));
      Assert.AreEqual(1, Kata.CloseCompare(6, 5));
      Assert.AreEqual(-1, Kata.CloseCompare(-6, -5));

      Assert.AreEqual(0, Kata.CloseCompare(2, 5, 3));
      Assert.AreEqual(1, Kata.CloseCompare(8.1, 5, 3));
      Assert.AreEqual(-1, Kata.CloseCompare(1.99, 5, 3));
    }
  }
}