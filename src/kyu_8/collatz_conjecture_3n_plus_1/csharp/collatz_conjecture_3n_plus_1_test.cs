namespace Solution
{
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
        yield return new TestCaseData(1u).Returns(0u);
        yield return new TestCaseData(5u).Returns(5u);
        yield return new TestCaseData(6u).Returns(8u);
        yield return new TestCaseData(23u).Returns(15u);
      }
    }

    [Test, TestCaseSource("testCases")]
    public uint SampleTest(uint n) => Kata.Hotpo(n);
  }
}