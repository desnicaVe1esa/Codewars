using System;
using NUnit.Framework;

[TestFixture]
public class DecomposeTests {

[Test]
  public void Test1() {
    Decompose d = new Decompose();
    long n = 11;
    Assert.AreEqual("1 2 4 10", d.decompose(n));
  }
}
