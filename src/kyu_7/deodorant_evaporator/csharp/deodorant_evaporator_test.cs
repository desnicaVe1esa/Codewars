using System;
using NUnit.Framework;

[TestFixture]
public class EvaporatorTests {

[Test]
  public void Test1() {
    Assert.AreEqual(22, Evaporator.evaporator(10, 10, 10));
  }
}