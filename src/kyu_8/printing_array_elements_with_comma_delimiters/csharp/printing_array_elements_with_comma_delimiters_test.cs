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
      var data = new object[] { 2, 4, 5, 2 };
      Assert.AreEqual("2,4,5,2", Kata.PrintArray(data), "int test failed");
    }
  }
}