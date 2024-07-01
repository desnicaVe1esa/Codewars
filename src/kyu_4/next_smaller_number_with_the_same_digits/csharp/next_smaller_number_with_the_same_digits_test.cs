using NUnit.Framework;
[TestFixture]
public class Tests
{
  [TestCase(21, ExpectedResult = 12)]
  [TestCase(907, ExpectedResult = 790)]
  [TestCase(531, ExpectedResult = 513)]
  [TestCase(1027, ExpectedResult = -1)]
  [TestCase(441, ExpectedResult = 414)]
  [TestCase(123456798, ExpectedResult = 123456789)]
  public long FixedTests(long n)
  {
    return Kata.NextSmaller(n);
  }
}