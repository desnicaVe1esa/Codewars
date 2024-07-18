namespace Solution {
  using NUnit.Framework;
  using System;
  [TestFixture]
  public class SolutionTest
  {
    [Test]
    public void SampleTests()
    {
      Assertion(600, "Jeong-Ho Aristotelis");
      Assertion(40,"CODEWARS", 5);
    }
    
    private static void Assertion(double expected, string name, double price = -1) =>
      Assert.AreEqual(
          expected,
          price == -1 ? Kata.Billboard(name) : Kata.Billboard(name, price),
      
          0.000001,
      
          $"\n  Name: \"{name}\"\n" +
            $"  Price: {(price == -1 ? 30 : price)}\n\n"
      
      );
  }
}
