using NUnit.Framework;
using System;
using System.Collections.Generic;

[TestFixture]
public class PascalsTriangleTests
{
    [Test]
    public void Level1()
    {
        CollectionAssert.AreEqual(
          new List<int> { 1 },
          Kata.PascalsTriangle(1));
    }

    [Test]
    public void Level2()
    {
        CollectionAssert.AreEqual(
          new List<int> { 1, 1, 1 },
          Kata.PascalsTriangle(2));
    }

    [Test]
    public void Level4()
    {
        CollectionAssert.AreEqual(
          new List<int> { 1, 1, 1, 1, 2, 1, 1, 3, 3, 1 },
          Kata.PascalsTriangle(4));
    }
}