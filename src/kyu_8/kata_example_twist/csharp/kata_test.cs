using System;
using NUnit.Framework;

[TestFixture]
public static class KataTests
{
  [Test]
  public static void Tests()
  {
    Assert.AreEqual(Kata.Websites.Length, 1000);
    Assert.AreEqual(Kata.Websites.GetType().GetElementType(), typeof(System.String));
    Assert.That(Array.TrueForAll(Kata.Websites, (v) => v == "codewars"));
  }
}