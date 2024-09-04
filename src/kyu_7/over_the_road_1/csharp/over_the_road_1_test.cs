using NUnit.Framework;
using System;

[TestFixture]
public class Basic_Tests {
  [Test]
  public void basic_test_cases() {
    Assert.AreEqual(6, CodeWars.OverTheRoad(1, 3));
    Assert.AreEqual(4, CodeWars.OverTheRoad(3, 3));
    Assert.AreEqual(5, CodeWars.OverTheRoad(2, 3));
    Assert.AreEqual(8, CodeWars.OverTheRoad(3, 5));
    Assert.AreEqual(16, CodeWars.OverTheRoad(7, 11));
  }
}