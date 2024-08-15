using System;
using NUnit.Framework;

[TestFixture]
public class KataTest
{
    [TestCase(1, "-----\n|.|.|\n|-+-|\n|.|.|\n-----")]
    [TestCase(3, "---------\n|...|...|\n|...|...|\n|...|...|\n|---+---|\n|...|...|\n|...|...|\n|...|...|\n---------")]
    public void FixedTests(int num, string expected)
    {
        Assert.AreEqual(expected, Kata.MakeAWindow(num));
    }
}