using NUnit.Framework;

[TestFixture]
public static class LeapYear
{
  [Test]
  public static void TestYear2020()
  {
    Assert.AreEqual(true, Kata.IsLeapYear(2020));
  }
  
  [Test]
  public static void TestYear2000()
  {
    Assert.AreEqual(true, Kata.IsLeapYear(2000));
  }
  
  [Test]
  public static void TestYear2015()
  {
    Assert.AreEqual(false, Kata.IsLeapYear(2015));
  }
  
  
  [Test]
  public static void TestYear2100()
  {
    Assert.AreEqual(false, Kata.IsLeapYear(2100));
  }
}
