namespace Solution
{
  using NUnit.Framework;

  using System;

  [TestFixture]
  public class Tests
  {
    [Test]
    public void ExampleTests()
    {
      Assert.AreEqual(96, Kata.SeatsInTheater(16, 11, 5, 3));

      Assert.AreEqual(0, Kata.SeatsInTheater(1, 1, 1, 1));

      Assert.AreEqual(18, Kata.SeatsInTheater(13, 6, 8, 3));

      Assert.AreEqual(99, Kata.SeatsInTheater(60,100,60,1));

      Assert.AreEqual(0, Kata.SeatsInTheater(1000,1000,1000,1000));
    }
  }
}