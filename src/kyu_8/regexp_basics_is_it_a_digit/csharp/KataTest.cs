using System;
using System.Text;
using System.Text.RegularExpressions;
using NUnit.Framework;

[TestFixture]
public class KataTest
{
    [Test]
    public void BasicTests()
    {
        Assert.AreEqual(false, "".Digit());
        Assert.AreEqual(true , "7".Digit());
        Assert.AreEqual(false, " ".Digit());
        Assert.AreEqual(false, "a".Digit());
        Assert.AreEqual(false, "a5".Digit());
        Assert.AreEqual(false, "14".Digit());
    }
}