using System;
using NUnit.Framework;

[TestFixture]
public static class Opstrings1Tests
{
    private static void testing(string actual, string expected)
    {
        Assert.AreEqual(expected, actual);
    }
[Test]
    public static void test1()
    {
        Console.WriteLine("Fixed Tests Rot");
        testing(Opstrings1.Oper(Opstrings1.Rot, "fijuoo\nCqYVct\nDrPmMJ\nerfpBA\nkWjFUG\nCVUfyL"),
                "LyfUVC\nGUFjWk\nABpfre\nJMmPrD\ntcVYqC\nooujif");
        testing(Opstrings1.Oper(Opstrings1.Rot, "rkKv\ncofM\nzXkh\nflCB"),
                "BClf\nhkXz\nMfoc\nvKkr");

        Console.WriteLine("Fixed Tests SelfieAndRot");
        testing(Opstrings1.Oper(Opstrings1.SelfieAndRot, "xZBV\njsbS\nJcpN\nfVnP"),
                "xZBV....\njsbS....\nJcpN....\nfVnP....\n....PnVf\n....NpcJ\n....Sbsj\n....VBZx");
        testing(Opstrings1.Oper(Opstrings1.SelfieAndRot, "uLcq\nJkuL\nYirX\nnwMB"),
                "uLcq....\nJkuL....\nYirX....\nnwMB....\n....BMwn\n....XriY\n....LukJ\n....qcLu");
    }
}