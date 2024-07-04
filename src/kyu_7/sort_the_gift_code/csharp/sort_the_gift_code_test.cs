namespace Solution
{
  using NUnit.Framework;
  using System;

  [TestFixture]
  public class SolutionTest
  {
    [Test]
    public void SampleTest()
    {
      Assert.AreEqual("abcdef", Kata.SortGiftCode("abcdef"));
      Assert.AreEqual("kpqsuvy", Kata.SortGiftCode("pqksuvy"));
      Assert.AreEqual("abcdefghijklmnopqrstuvwxyz", Kata.SortGiftCode("zyxwvutsrqponmlkjihgfedcba"));
    }
  }
}