namespace Solution {
  using NUnit.Framework;
  using System;


  [TestFixture]
  public class Test
  {
    [Test]
    public void SampleTest()
    {
      Assert.AreEqual("Hi!", Kata.Remove("Hi!"));
      Assert.AreEqual("Hi!", Kata.Remove("Hi!!!"));
      Assert.AreEqual("Hi!", Kata.Remove("!Hi"));
      Assert.AreEqual("Hi!", Kata.Remove("!Hi!"));
      Assert.AreEqual("Hi Hi!", Kata.Remove("Hi! Hi!"));
      Assert.AreEqual("Hi!", Kata.Remove("Hi"));
    }
  }
}