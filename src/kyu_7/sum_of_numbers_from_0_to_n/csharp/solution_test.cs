namespace Solution {
  using NUnit.Framework;
  using System;

  [TestFixture]
  public class SequenceSumTests
  {
    [Test]
    public void BasicTests()
    {
      Assert.AreEqual("0+1+2+3+4+5+6 = 21", SequenceSum.ShowSequence(6));
    }
  }
}