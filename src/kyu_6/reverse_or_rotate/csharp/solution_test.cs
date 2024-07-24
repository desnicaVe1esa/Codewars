using System;
using NUnit.Framework;

[TestFixture]
public static class RevrotTests
{

    private static void testing(string actual, string expected)
    {
        Assert.AreEqual(expected, actual);
    }

[Test]
    public static void test1()
    {
        Console.WriteLine("Testing RevRot");
        testing(Revrot.RevRot("1234", 0), "");
        testing(Revrot.RevRot("", 0), "");
        testing(Revrot.RevRot("1234", 5), "");
        String s = "733049910872815764";
        testing(Revrot.RevRot(s, 5), "330479108928157");
    }
}