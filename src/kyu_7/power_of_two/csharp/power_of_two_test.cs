namespace Solution {
  using NUnit.Framework;
  using System;
  using System.Collections.Generic;

  [TestFixture]
  public class SolutionTest
  {
    private static IEnumerable<TestCaseData> testCases
    {
      get
      {
        yield return new TestCaseData(2).Returns(true);
        yield return new TestCaseData(4096).Returns(true);
        yield return new TestCaseData(5).Returns(false);
      }
    }

    [Test, TestCaseSource("testCases")]
    public bool SampleTest(int n) => Kata.PowerOfTwo(n);
  }
}