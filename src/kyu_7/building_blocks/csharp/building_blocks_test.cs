using System;
using NUnit.Framework;

[TestFixture]
public class Tests
{
  [Test]
  public static void ExampleTest()
  {
    Block b = new Block(new int[]{2,2,2});
    Assert.AreEqual(2, b.GetWidth());
    Assert.AreEqual(2, b.GetLength());
    Assert.AreEqual(2, b.GetHeight());
    Assert.AreEqual(8, b.GetVolume());
    Assert.AreEqual(24, b.GetSurfaceArea());
  }
}