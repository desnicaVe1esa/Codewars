using NUnit.Framework;
using System;
using System.Collections.Generic;
public class JosephusTestSample
{

    [Test]
    public void Test1()
    {
        JosephusTest(new object[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 1, new object[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
    }

    [Test]
    public void Test2()
    {
        JosephusTest(new object[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 2, new object[] { 2, 4, 6, 8, 10, 3, 7, 1, 9, 5 });
    }

    [Test]
    public void Test3()
    {
        JosephusTest(new object[] { "C", "o", "d", "e", "W", "a", "r", "s" }, 4, new object[] { "e", "s", "W", "o", "C", "d", "r", "a" });
    }

    [Test]
    public void Test4()
    {
        JosephusTest(new object[] { 1, 2, 3, 4, 5, 6, 7 }, 3, new object[] { 3, 6, 2, 7, 5, 1, 4 });
    }

    [Test]
    public void Test5()
    {
        JosephusTest(new object[] { }, 3, new object[] { });
    }

    private void JosephusTest(object[] items, int k, object[] result)
    {
        Assert.AreEqual(new List<object>(result), Josephus.JosephusPermutation(new List<object>(items), k));
    }
}