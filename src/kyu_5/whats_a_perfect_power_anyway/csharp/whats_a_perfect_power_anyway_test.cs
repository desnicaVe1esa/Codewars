using NUnit.Framework;
using System;
public class PerfectPowerTest
{
    [Test]
    public void Test0()
    {
        Assert.IsNull(PerfectPower.IsPerfectPower(0), "0 is not a perfect number");
    }

    [Test]
    public void Test1()
    {
        Assert.IsNull(PerfectPower.IsPerfectPower(1), "1 is not a perfect number");
    }

    [Test]
    public void Test2()
    {
        Assert.IsNull(PerfectPower.IsPerfectPower(2), "2 is not a perfect number");
    }

    [Test]
    public void Test3()
    {
        Assert.IsNull(PerfectPower.IsPerfectPower(3), "3 is not a perfect number");
    }

    [Test]
    public void Test4()
    {
        Assert.AreEqual((2, 2), PerfectPower.IsPerfectPower(4), "4 = 2^2");
    }

    [Test]
    public void Test5()
    {
        Assert.IsNull(PerfectPower.IsPerfectPower(5), "5 is not a perfect power");
    }

    [Test]
    public void Test8()
    {
        Assert.AreEqual((2, 3), PerfectPower.IsPerfectPower(8), "8 = 2^3");
    }

    [Test]
    public void Test9()
    {
        Assert.AreEqual((3, 2), PerfectPower.IsPerfectPower(9), "9 = 3^2");
    }

    [Test]
    public void TestUpTo500()
    {
        var pp = new int[] { 4, 8, 9, 16, 25, 27, 32, 36, 49, 64, 81, 100, 121, 125, 128, 144, 169, 196, 216, 225, 243, 256, 289, 324, 343, 361, 400, 441, 484 };
        foreach (var i in pp)
            Assert.IsNotNull(PerfectPower.IsPerfectPower(i), $"{i} is a perfect power");
    }
}