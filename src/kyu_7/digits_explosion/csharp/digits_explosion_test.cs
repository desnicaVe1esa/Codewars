using NUnit.Framework;
using System;

[TestFixture]
public static class DigitsTests
{
    [TestCase("312", "333122")]
    [TestCase("102269","12222666666999999999")]
    public static void ExplodeTests(string s, string result)
    {
        Assert.AreEqual(result, Digits.Explode(s), $"\"{s}\" is exploded incorrectly");
    }
}