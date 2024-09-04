using System;
using System.Collections.Generic;
using NUnit.Framework;

[TestFixture]
public class RemovedNumbersTests {

[Test]
  public void Test1() {
    List<long[]> r = new List<long[]> {
        new long[] { 15, 21 },
        new long[] { 21, 15 }
    };
    Assert.AreEqual(r, RemovedNumbers.removNb(26));
  }
[Test]
  public void Test2() {
    Assert.AreEqual(new long[0], RemovedNumbers.removNb(100));
  }
}